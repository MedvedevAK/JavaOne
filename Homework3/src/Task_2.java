import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static boolean over = true;
    private static String input;
    private static String placeholder = "#";
    private static String tip;
    private static int pH;
    private static int inputLength;
    private static int count;

    public static void main(String[] args) {
        startGame();
        guess();
    }

    private static void startGame() {
        System.out.println("Welcome!");
        System.out.println("Загадано одно из 25 слов:");
        System.out.println("\"apple\", \"orange\", \"lemon\", \"banana\", \"apricot\",\n" +
                "\"avocado\", \"broccoli\", \"carrot\", \"cherry\", \"garlic\",\n" +
                "\"grape\", \"melon\", \"leak\", \"kiwi\", \"mango\", \"mushroom\",\n" +
                "\"nut\", \"olive\", \"pea\", \"peanut\", \"pear\", \"pepper\",\n" +
                "\"pineapple\", \"pumpkin\", \"potato\"");
        System.out.println("Попробуйте отгадать!))");
    }

    private static void guess() {

        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"
        };
        int wordLength = words.length;
        int guessWord = random.nextInt(wordLength);
        String hiddenWord = words[guessWord];
        int hiddenWordLength = hiddenWord.length();
        do {
            System.out.println("Введите слово:");
            count = 0;
            while (!scanner.hasNext()) {
                System.out.println("Введите слово:");
            }
            input = scanner.nextLine().toLowerCase();
            inputLength = input.length();
            tip = "";
            for (int i = 0; i < inputLength && i < hiddenWordLength; i++) {
                if (input.charAt(i) == hiddenWord.charAt(i)) {
                    tip += input.charAt(i);
                    count++;
                } else tip += placeholder;
            }
            pH = 15 - tip.length();
            for (int i = 0; i < pH; i++) {
                tip += placeholder;
            }
            if (inputLength == hiddenWordLength && count == hiddenWordLength) {
                over = false;
                System.out.println("Вы победили!!!");
            }else if (count > 0) System.out.println(tip);
             else System.out.println("нет совпадений\n");
        } while (over);
    }
}