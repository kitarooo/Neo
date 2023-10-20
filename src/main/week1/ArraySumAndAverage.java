import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int column = scanner.nextInt();
        char operation = scanner.next().charAt(0);

        double[][] array = new double[12][12];
        for (int i = 0; i < 12; i++) {
//            System.out.println("");
            for (int j = 0; j < 12; j++) {
//                array[i][j] = Math.round(Math.random()*10);
                array[i][j] = scanner.nextDouble();
//                System.out.print(array[i][j] + " ");
            }
        }

//        System.out.println(" ");
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += array[i][column];
        }

        if (operation == 'M') {
            double average = sum / 12;
            System.out.printf("%.1f", average);
        } else if (operation == 'S') {
            System.out.printf("%.1f", sum);
        }

        scanner.close();
    }
}
