import java.util.Scanner;

public class GameDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();

        int totalStartMinutes = startHour * 60 + startMinute;
        int totalEndMinutes = endHour * 60 + endMinute;

        int durationMinutes;
        if (totalStartMinutes < totalEndMinutes) {
            durationMinutes = totalEndMinutes - totalStartMinutes;
        } else {
            durationMinutes = (24 * 60 - totalStartMinutes) + totalEndMinutes;
        }

        int durationHours = durationMinutes / 60;
        durationMinutes %= 60;

        System.out.println("O JOGO DUROU " + durationHours + " HORA(S) E " + durationMinutes + " MINUTO(S)");

        scanner.close();
    }
}
