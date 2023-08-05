import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double v1 = 0;
        double v2 = 0;

        Scanner in = new Scanner(System.in);
        
        v1 = in.nextDouble();
        v2 = in.nextDouble();

        System.out.println(maxValue(v1, v2));
    }

    private static double maxValue(double v1, double v2) {
        return Math.max(v1, v2);
    }
}
