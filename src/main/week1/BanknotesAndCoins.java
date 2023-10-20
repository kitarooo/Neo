import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = Double.parseDouble(scanner.next());

        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int note : notes) {
            int count = (int) (value / note);
            System.out.println(count + " nota(s) de R$ " + note + ".00");
            value %= note;
        }

        System.out.println("MOEDAS:");
        for (double coin : coins) {
            int count = (int) (value / coin);
            System.out.println(count + " moeda(s) de R$ " + String.format("%.2f", coin));
            value %= coin;
        }

        scanner.close();
    }
}
