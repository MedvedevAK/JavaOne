public class Task_3 {
    public static void main (String[]args){
        System.out.println("Task_3");
        int [] m = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // I am make massive (everything very easy)))

        for (int i = 0; i < m.length; i ++){// я создал цикл for и будем листать наш массив
            if (m[i] < 6) m[i] = m[i]*2;// создали условие в котором если значение числа ,под котором стоит массив, меньше 6 тогда умножаем занчение числа на 2
            else m[i]= m[i];// ну а если больше тогда значение остается значением )))
            System.out.println(m[i]);
        }
        System.out.println("mission complete");
    }
}
