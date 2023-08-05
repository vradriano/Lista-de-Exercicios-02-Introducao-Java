import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o número da semana de 1 a 7.");
        System.out.println(getWeekDayName(in.nextInt()));
    }

    private static String getWeekDayName(int weekDay) {
        String[] weekDaysName = {
                "Segunda feira", "Terça feira", "Quarta feira",
                "Quinta feira", "Sexta feira", "Sábado", "Domingo"
        };

        if (weekDay >= 1 && weekDay <= 7) {
            return weekDaysName[weekDay - 1];
        } else {
            return "Número inválido. Por favor insira um valor de 1 a 7.";
        }
    }
}
