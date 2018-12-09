public class Task_4 {
    public static void main (String[]args){
        System.out.println("Task_4");
        int N = 10;
        int m [][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            m[i][i] = 1;
        }
        for (int i = 0 ; i < N ; i++){
            m[i][N - 1 - i] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf(m[i][j] + "  ");
            System.out.println();
        }
        System.out.println("mission complete");
    }
}




