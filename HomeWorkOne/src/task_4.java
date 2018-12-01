import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(task(scanner.nextInt(),scanner.nextInt()));
    }
    private static boolean task(int a, int b){
        return 10 <= (a + b) && (a + b) <= 20;
    }
}

