import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int drivenKilometers = 0, usedGasoline = 0, selectedOption;
        List<ArrayList<Integer>> tanksInfo = new ArrayList<>();
        boolean isContinue = true;

        Scanner in = new Scanner(System.in);

        System.out.println("-".repeat(10) + " Bem vindo " + "-".repeat(10));

        while (isContinue) {
            System.out.println("[1] - Cadastrar novo tanque de gasolina");
            System.out.println("[2] - Ver tanques cadastrados");
            System.out.println("[0] - Sair");
            System.out.println("Digite a opção escolhida: ");

            selectedOption = in.nextInt();
            switch (selectedOption) {
                case 1 -> {
                    System.out.println("Digite os quilometros dirigidos: ");
                    drivenKilometers = in.nextInt();
                    System.out.println("Digite a quantidade de gasolina consumida: ");
                    usedGasoline = in.nextInt();
                    double consumption = (float) drivenKilometers / usedGasoline;

                    ArrayList<Integer> tankInfo = new ArrayList<>();
                    tankInfo.add(drivenKilometers);
                    tankInfo.add(usedGasoline);
                    tanksInfo.add(tankInfo);

                    System.out.println("Kilometros: " + drivenKilometers);
                    System.out.println("Gasolina: " + usedGasoline);
                    System.out.println("Consumo: " + consumption + " km/l");

                    System.out.println("Operação efetuada com sucesso.");
                }
                case 2 -> {
                    System.out.println("Tanques cadastrados:");
                    if(!tanksInfo.isEmpty()) {
                        for (int i = 0; i < tanksInfo.size(); i++) {
                            ArrayList<Integer> tank = tanksInfo.get(i);
                            int kilometers = tank.get(0);
                            int gasoline = tank.get(1);
                            double consumption = (float) kilometers / gasoline;

                            System.out.println("Tanque " + (i + 1) + ":");
                            System.out.println("Kilometros: " + kilometers);
                            System.out.println("Gasolina: " + gasoline);
                            System.out.println("Consumo: " + consumption + " km/l");
                        }
                    } else {
                        System.out.println("Você não tem tanque cadastrado! Por favor, cadastre um.");
                    }
                }
                case 0 -> {
                    isContinue = false;
                    in.close();
                    System.out.println("A Solutis agradece!");
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
