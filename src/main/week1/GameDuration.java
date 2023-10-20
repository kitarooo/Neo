import java.util.Scanner;

public class GameDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startH = scanner.nextInt();
        int startM = scanner.nextInt();
        int endH = scanner.nextInt();
        int endM = scanner.nextInt();

        int totalStart = startH * 60 + startM;
        int totalEnd = endH * 60 + endM;

        int duration = 0;
        if (totalStart < totalEnd) {
            duration = totalEnd - totalStart;
        } else {
            duration = (24 * 60 - totalStart) + totalEnd;
        }

        int durationH = duration / 60;
        duration = duration % 60;

        System.out.println("O JOGO DUROU " + durationH + " HORA(S) E " + duration + " MINUTO(S)");

        scanner.close();
    }
}
