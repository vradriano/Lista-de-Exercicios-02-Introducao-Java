import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String vowelsString = "AEIOU";
        int vowels = 0, consonants = 0, whiteSpaces = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva uma sequência de caracteres: ");
        String input = in.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toUpperCase(input.charAt(i));
            if (ch >= 'A' && ch <= 'Z') {
                if (vowelsString.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                whiteSpaces++;
            }
        }

        System.out.println("Vogais: " + vowels);
        System.out.println("Consoantes: " + consonants);
        System.out.println("Espaços em branco: " + whiteSpaces);
    }
}
