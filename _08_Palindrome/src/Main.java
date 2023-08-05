import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        checkIfIsPalindrome(in.nextLine());
    }

    private static void checkIfIsPalindrome(String s) {
        String reverseStr = "";
        int strLength = s.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + s.charAt(i);
        }

        if (s.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(s + " é um palíndromo.");
        }
        else {
            System.out.println(s + " não é um palíndromo.");
        }
    }
}
