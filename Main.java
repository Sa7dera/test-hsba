import java.util.Scanner;
public class Main{

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadz swoj wiek");
        
        int age = scanner.nextInt();

        if (age < 18){
            System.out.println("jestes niepelnoletni");
        }

        else if (age >= 18){
            System.out.println("jestes pelnoletni");
        }
        scanner.close();

    }
}