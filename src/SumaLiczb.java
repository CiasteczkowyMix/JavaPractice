import java.util.Scanner;

public class SumaLiczb {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int liczba;
        while( true ){
            System.out.println("Podaj liczbę:");
            String meanwhile = key.nextLine();
            try {
                liczba = Integer.parseInt(meanwhile);
                if(liczba < 1){

                }else {
                    break;
                }
            } catch(Exception e) {
            }
        }
        int output=0;
        for (int x = 0; x < liczba; x++){
            output += x;
        }
        System.out.println("Suma ciągu od 1 do "+liczba+" jest równa "+output);
        }
}
