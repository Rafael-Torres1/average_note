import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        int note1;
        int note2;
        int note3;

        System.out.print("digite sua primeira: ");
        note1 = enter.nextInt();

        System.out.print("digite sua segunda nota: ");
        note2 = enter.nextInt();

        System.out.print("digite sua terceira nota: ");
        note3 = enter.nextInt();

        double avg = (note1 + note2 + note3) / 3;

    }
}