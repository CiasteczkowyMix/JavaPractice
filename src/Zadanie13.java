import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int ciasteczka = 40;
        int porcja = ciasteczka/10;
        double kaloriePorcja = 300;
        double kalorieCiasteczka = kaloriePorcja/porcja;
        int zjedzoneCiasteczka;
        while( true ){
            System.out.println("Podaj liczbę zjedzonych ciasteczek:");
            String meanwhile = key.nextLine();
            try {
                zjedzoneCiasteczka = Integer.parseInt(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        System.out.println("Zjadłeś "+zjedzoneCiasteczka*kalorieCiasteczka+" kalorii");
    }
}
