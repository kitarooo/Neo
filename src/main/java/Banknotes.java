import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(amount);

        int[] banknotes = { 100, 50, 20, 10, 5, 2, 1 };
        int[] quantity = new int[7];

        for (int i = 0; i < 7; i++) {
            quantity[i] = amount / banknotes[i];
            amount %= banknotes[i];
            System.out.println(quantity[i] + " nota(s) de R$ " + banknotes[i] + ",00");
        }

        scanner.close();
    }
}