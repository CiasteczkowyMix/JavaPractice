import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double mealPrice;
        while( true ){
            System.out.println("Podaj cenę posiłku:");
            String meanwhile = key.nextLine();
            try {
                mealPrice = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        double taxPercentage = 0.0675;
        double tipPercentage = 0.2;
        double tax = mealPrice*taxPercentage;
        double tip = tipPercentage * (mealPrice+tax);
        System.out.println("Cena posiłku: "+mealPrice+
                "\nWartość podatku: "+tax+
                "\nWartość napiwku: "+tip+
                "\nDo zapłaty: "+(mealPrice + tax + tip));
    }
}
