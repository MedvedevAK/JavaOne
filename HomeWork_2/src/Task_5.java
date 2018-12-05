public class Task_5 {
    public static void main (String[]args){
        System.out.println("Task_5");
        int [] m = {27, 11, 13, 15, 91, 43, 89, 22, 212}; // задал целочисленный массив со значениями...
        int max = m[0];// присвоил пременной первое значение массива
        int min = m[0];// тоже самое))

        for(int i = 1; i < m.length; i ++){// проверка начнется со 2ого по счету значения т.е. с i=1 (11) ; i(1)<8 ; +1 и так пролистываем весь цикл.
            if(m[i] > max){// m [i]= 11 > max= 27. MAX больше значит 27 остается.
                max = m[i];// 27=27.
            }
            if(m[i] < min){ // m[i]= 11 < min=27 значит 11 остается.
                min = m[i];// 11=11.
            }
        }
        System.out.println(min + " " +"min "+ max + " max ");
        System.out.println("mission complete");
    }


}


