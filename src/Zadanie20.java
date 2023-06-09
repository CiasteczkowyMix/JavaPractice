import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int ciasteczka;
        while( true ){
            System.out.println("Podaj ilość ciasteczek:");
            String meanwhile = key.nextLine();
            try {
                ciasteczka = Integer.parseInt(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        double szklankaMaki = 2.75;
        double szklankaCukru = 1.5;
        double szklankaMasla = 1;

        System.out.println("By upiec "+ciasteczka+" ciasteczek potrzeba:\n"+
                szklankaCukru*ciasteczka/48+" szklanek cukru\n"+
                szklankaMasla*ciasteczka/48+" szklanek masła\n"+
                szklankaMaki*ciasteczka/48+" szklanek mąki\n");
    }
}
