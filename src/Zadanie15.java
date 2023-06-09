import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double price;
        while( true ){
            System.out.println("Podaj cenę detaliczną płytki:");
            String meanwhile = key.nextLine();
            try {
                price = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        double marza = 0.4;
        double zysk = price*marza;

        System.out.println("Zysk z sprzedaży jednej płytki wyniesie: "+zysk);
    }
}
