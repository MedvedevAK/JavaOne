public class Task_6 {
    public static void main (String[]args){
        System.out.println("Task_6");
        int [] array = {1,2,3,6,};
        int length = array.length;
        int leftSum;
        int rightSum;

        for (int i = 0; i < length - 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j <= i; j++) {
                leftSum += array[j];
            }

            for (int k = i + 1; k < length; k++) {
                rightSum += array[k];
            }

            if (leftSum == rightSum){
                System.out.println("true");
        }else {
                System.out.println("false");
            }

    }
}
}
