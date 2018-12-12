
import java.util.Scanner;

public class Task1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        method( 0, 0);
    }

    private static int method(int range, int res) {
        do {
            System.out.print("Вы будете угадывать число от 0 до  ");
            range = scanner.nextInt();
            System.out.println("Число загадано от 0 до " + range);
            System.out.println("У Вас всего 3 потпытки!");
            int number = (int) (Math.random() * range);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Попытка №" + i + ":");
            System.out.println();
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы выйграли!!! Мои поздравления !!! ВЫ ГЕНИАЛЬНЫ!)))");
                System.out.println("Хотите сыграть еще? Если да нажмите - 1. Если нет нажмит любую другю клавишу.");
                break;
            } else if (i == 3 && input_number != number) {
                System.out.println("Вы проиграли =*(");
                System.out.println("Хотите сыграть еще? Если да нажмите - 1. Если нет нажмит любую другю клавишу.");
                break;
            } else if (input_number < number) {
                System.out.println("Загадноое число больше.");
            } else if (input_number > number) {
                System.out.println("Загадноое число меньше.");
            }
        }
       res = scanner.nextInt();
        }while (res == 1);
        return range;
}


}