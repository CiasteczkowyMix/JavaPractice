import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double droga,paliwo;
        while( true ){
            System.out.println("Podaj liczbę przejechanych kilometrów:");
            String meanwhile = key.nextLine();
            try {
                droga = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        while( true ){
            System.out.println("Podaj ilość zużytego paliwa:");
            String meanwhile = key.nextLine();
            try {
                paliwo = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        System.out.println("Na jednym litrze paliwa samochód przejechał "+droga/paliwo+" kilometrów");
        }
}
