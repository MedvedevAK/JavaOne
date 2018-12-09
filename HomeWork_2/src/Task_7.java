public class Task_7 {
    public static void main (String[] args){
        System.out.println("Task_7");
        int[] mass = new int[] { 1, 2, 3, 4, 5 };
        for (int i : mass) {
            System.out.print(i + " ");
        }
        System.out.println();
        new Task_7().reverse(mass, -4); // кидаем массив и число на которое нужно
        // сдвинуть
        for (int i : mass) {
            System.out.print(i + " ");
        }
    }

    private int[] reverse(int[] input, int sdvig) {
        sdvig *= - 1;
        if (sdvig > input.length || sdvig < 1) {
            System.out.println("Неверное количество сдвигов");
            return input;
        }

        int[] output = new int[input.length];
        int j = 0;
        for (int i : input) {
            output[j++] = i;
        }
        int tmp = sdvig;

        for (int i = 0; i < output.length; i++) {
            if (sdvig > 0) {
                input[i] = output[output.length - sdvig];
                sdvig--;
            } else {
                input[i] = output[i - tmp];
            }
        }
        return input;
    }

}


