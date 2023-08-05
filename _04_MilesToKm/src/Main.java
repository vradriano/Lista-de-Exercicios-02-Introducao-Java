import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, digite a distância em milhas");
        int miles = in.nextInt();

        double kilometers = miles * 1.609;
        int kilometersInt = (int) kilometers;
        double remainingMeters = (kilometers - kilometersInt) * 1000;

        System.out.printf("A distância é de %d quilômetros e %.0f metros.%n",
                kilometersInt, remainingMeters);
    }
}
