import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        System.out.println(value);

        int[] notes = {100, 50, 20, 10, 5, 2, 1};


        for (int note : notes) {
            int count = value / note;
            System.out.println(count + " nota(s) de R$ " + note + ",00");
            value = value % note;
        }

        scanner.close();
    }
}
