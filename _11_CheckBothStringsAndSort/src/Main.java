import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, digite duas palavras: ");
        compareAndSortStrings(in.nextLine(), in.nextLine());
    }

    private static void compareAndSortStrings(String wordOne, String wordTwo) {
        int biggerWordLexicographically = wordOne.toLowerCase().compareTo(wordTwo);
        String longestWord = wordOne.length() > wordTwo.length() ? wordOne : wordTwo;

        if(biggerWordLexicographically > 0) {
            System.out.println(wordOne + ", " + wordTwo);
        } else {
            System.out.println(wordTwo + ", " + wordOne);
        }

        System.out.println("Maior palavra: " + longestWord);
    }
}
