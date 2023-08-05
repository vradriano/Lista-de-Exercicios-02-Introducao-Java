public class Main {
    public static void main(String[] args) {
        int productInt = 1;
        float productFloat = 1;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                productInt *= i;
                productFloat *= i;
            }
        }

        System.out.println("Produto inteiro: " + productInt);
        System.out.println("Produto flutuante: " + productFloat);
    }
}
