package week1;

import java.util.Scanner;

public class LogicalSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int counter = 1;

        for (int i = 1; i <= y; i++) {
            System.out.print(i);

            if (counter == x) {
                System.out.println();
                counter = 0;
            } else if (i != y) {
                System.out.print(" ");
            }

            counter++;
        }

        scanner.close();
    }
}
