public class Task_1 {
    public static void main (String[] args) {
        int[] task = {1, 0, 1, 1, 1, 0, 0, 1, 0};// Создан массив
        int tl = task.length; // здали переменную tl и запихнули в нею всю длину массива( или узнали инфу о нем)

        for (int i = 0; i < tl; i++) { // Создана переменная цикл for, переменная i < tl , инкримент i;
            if (task[i] == 0) task[i] = 1;// task [i] сравниваем с 0 если true ,то присваиваем 1 если false ,то 0.
            else task [i] = 0;
        }
        System.out.println("Task_1");
        for (int i = 0; i < tl; i++) {
            System.out.print(task[i]+ ",  ");
        }
        System.out.println();
        System.out.println("mission complete. Thanks.");
    }
}

