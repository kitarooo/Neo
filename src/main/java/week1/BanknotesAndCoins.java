package week1;

import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = Double.parseDouble(scanner.next()) * 100;

        double[] notes = {10000, 5000, 2000, 1000, 500, 200};
        double[] coins = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (double note : notes) {
            int nominal = (int) (value / note);
            System.out.println(nominal + " nota(s) de R$ " + String.format("%.2f", note/100));
            value = value % note;
        }

        System.out.println("MOEDAS:");
        for (double coin : coins) {
            int nominal = (int) (value / coin);
            System.out.println(nominal + " moeda(s) de R$ " + String.format("%.2f", coin/100));
            value = value % coin;
        }

        scanner.close();
    }
}
