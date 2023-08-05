public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Integer: " + i / 2);
                System.out.println("Double: " + (double) i / 2);
            }
        }

    }
}
