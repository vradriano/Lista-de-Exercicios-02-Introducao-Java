import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int num = in.nextInt();

        checkNumberAndLowersPrime(num);
    }

    public static void checkNumberAndLowersPrime(int n) {
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    };
}
