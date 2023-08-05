import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe uma área: ");
        System.out.println(calcCircleArea(in.nextDouble()));
    }

    private static double calcCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
