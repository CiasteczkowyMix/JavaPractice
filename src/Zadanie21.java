import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double kwota;
        while( true ){
            System.out.println("Podaj zdeponowaną kwotę:");
            String meanwhile = key.nextLine();
            try {
                kwota = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        double procent;
        while( true ){
            System.out.println("Podaj roczną stopę procentową:");
            String meanwhile = key.nextLine();
            try {
                procent = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        procent = procent/100;
        int rozliczenieOkres;
        while( true ){
            System.out.println("Podaj ile razy w roku odsetki są kapitalizowane:");
            String meanwhile = key.nextLine();
            try {
                rozliczenieOkres = Integer.parseInt(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        double czas;
        while( true ){
            System.out.println("Podaj po ilu lat środki zostaną wyciągnięte:");
            String meanwhile = key.nextLine();
            try {
                czas = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        double profit = kwota*Math.pow((1+procent/rozliczenieOkres),czas*rozliczenieOkres);
        System.out.println("Kwota na koncie: "+profit);
    }
}
