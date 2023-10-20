import java.util.Scanner;

public class PupulationIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            int PA = scanner.nextInt();
            int PB = scanner.nextInt();

            double G1 = scanner.nextDouble();
            double G2 = scanner.nextDouble();

            int years = 0;
            while (PB >= PA) {
                PA += (PA * G1) / 100;
                PB += (PB * G2) / 100;
                years++;

                if (years > 100) {
                    System.out.println("Mais de 1 seculo");
                }
            }

            if (years <= 100) {
                System.out.println(years + " anos.");
            }
        }
    }
}