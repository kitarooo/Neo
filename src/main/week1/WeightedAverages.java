import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();

        for (int i = 0; i < testcase; i++) {
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            double number3 = scanner.nextDouble();

            double weightedAverage = ((number1 * 2) + (number2 * 3) + (number3 * 5)) / 10;
            System.out.printf("%.1f%n", weightedAverage);
        }

        scanner.close();
    }
}