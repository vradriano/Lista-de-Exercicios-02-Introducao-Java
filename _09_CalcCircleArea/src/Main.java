import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe uma área: ");
        System.out.println(calcCircleArea(in.nextDouble()));
    }

    private static double calcCircleArea(double radius) {
        double pi = 3.14159265359;

        return Math.round(pi * (radius * radius) * 100.0) / 100.0;
    }
}
