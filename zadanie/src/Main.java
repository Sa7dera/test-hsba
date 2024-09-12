import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj wzrost");
        int wzrost = sc.nextInt();

        System.out.println("podaj wage");
        int waga = sc.nextInt();
int bmi = waga / (wzrost * wzrost);
        if (bmi < 18.5) {
            System.out.println("niedowaga");

             if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("waga optymalna");
            }
             else if(bmi >= 25 && bmi <= 29.9) {
                System.out.println("nadwaga");
            }
             else if(bmi >= 30) {
                 System.out.println("otylosc");
             }
        }


    }
}



