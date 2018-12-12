import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static final int SIZE = 5; //размер поля
    static final char DOT_X = 'x'; //игрок
    static final char DOT_O = 'o'; //ИИ
    static final char DOT_EMPTY = '.'; //пустая ячейка
    static char[][] map = new char[SIZE][SIZE];
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    static public void main(String[] args) {
        go();
    }

    static void go() { //запуск игры
        initMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы выйграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("ИИ одерживает верх!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра окончена.");
    }

    static void initMap() { //инициализируем массив map
        for (int i = 0; i < SIZE; i++) { //двойным циклом проходимся по всему массиву
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY; //и заполняем каждую ячейку *
            }
        }
    }

    static void humanTurn() { //ход человека
        int x, y;
        do {
            System.out.println("Enter X and Y (1-5):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    static void aiTurn() {
        int x, y;
        for (x = 0; x < SIZE; x++)
            for (y = 0; y < SIZE; y++)
                if (isCellValid(x, y)) {
                    map[y][x] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[y][x] = DOT_O;
                        return;
                    }
                    map[y][x] = DOT_EMPTY;
                }
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    static void printMap() { //вывод поля в консоль

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " "); //печать поля по горизонтали
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1+" "); //печать поля по вертикали
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean checkWin(char dot) { //проверка победы
        int diag1, diag2, hor, ver;
        for (int i = 0; i < SIZE; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    hor++;
                }
                if (map[j][i] == dot) {
                    ver++;
                }
            }
            if (hor == SIZE || ver == SIZE) {
                return true; //проверка по горизонтали и вертикали
            }
        }
        diag1 = 0;
        diag2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == dot) {
                diag1++;
            }
            if (map[i][SIZE - i - 1] == dot) {
                diag2++;
            }
        }
        if (diag1 == SIZE || diag2 == SIZE) {
            return true; //проверка по диагоналям
        }
        return false;
    }

    static boolean isMapFull() { //проверка на заполненность поля
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    static boolean isCellValid(int x, int y) { //поиск свободной ячейки
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
}