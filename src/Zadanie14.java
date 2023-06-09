import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double test1,test2,test3;
        while( true ){
            System.out.println("Podaj wynik pierwszego testu:");
            String meanwhile = key.nextLine();
            try {
                test1 = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        while( true ){
            System.out.println("Podaj wynik drugiego testu:");
            String meanwhile = key.nextLine();
            try {
                test2 = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        while( true ){
            System.out.println("Podaj wynik trzeciego testu:");
            String meanwhile = key.nextLine();
            try {
                test3 = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        double avg = (test1 + test2 + test3)/3;
        System.out.println("Ocena z pierwszego testu: " +test1+
                "\nOcena z drugiego testu: " +test2+
                "\nOcena z trzeciego testu: " +test3+
                "\nŚrednia: " +avg);
    }
}
