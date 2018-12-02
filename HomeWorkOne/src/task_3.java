public class task_3 {
    public static void main(String[] args) {
       method(10, 24, 30, 2);
    }
    private static double method(double a, double b, double c, double d) {
        double result = 0;
        if (d == 0) System.out.println("На ноль делить нельзя");
        else result = a * (b + (c / d));System.out.println(result);
        return result;
    }
}

