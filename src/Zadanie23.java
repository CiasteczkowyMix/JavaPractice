import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double rowSize;
        while( true ){
            System.out.println("Podaj długość rzędu (metry):");
            String meanwhile = key.nextLine();
            try {
                rowSize = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        double crate;
        while( true ){
            System.out.println("Podaj wielkość krat (metry):");
            String meanwhile = key.nextLine();
            try {
                crate = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        double space;
        while( true ){
            System.out.println("Podaj odległości między sadzonkami(metry)");
            String meanwhile = key.nextLine();
            try {
                space = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        System.out.println("W rzędzie mieszczą się: "+
                (rowSize-2*crate)/space+" sadzonki");
    }
}
