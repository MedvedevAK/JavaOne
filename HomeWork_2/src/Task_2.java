public class Task_2 {
    public static void main (String[]args){
    int[] m = new int [11];
    int l = 0;
    int tl = m.length;
        System.out.println("Task_2");

    for(int i = 0; i < tl; i++, l = l + 3){
        m[i]= l;
            System.out.println(m[i]+ "-" + i);
        }
        System.out.println("mission complete");
    }
}
