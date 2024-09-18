import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ile punktow z testu");

        int pkt = scanner.nextInt();

        if (pkt >= 90 && pkt < 100){
            System.out.println("Ocena A");
        }
        else if (pkt >= 80 && pkt < 89){
            System.out.println("Ocena B");
        }
        else if (pkt >= 70 && pkt < 79){
            System.out.println("Ocena C");
        }
        else if ( pkt >= 60 && pkt < 69){
            System.out.println("Ocena D");
        }
        else if ( pkt < 60){
            System.out.println("Ocena F");
        }
    }
}