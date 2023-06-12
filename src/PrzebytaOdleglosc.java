import java.util.Scanner;

public class PrzebytaOdleglosc {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int speed;
        while( true ){
            System.out.println("Podaj prędkość:");
            String meanwhile = key.nextLine();
            try {
                speed = Integer.parseInt(meanwhile);
                if(speed < 0){

                }else {
                    break;
                }
            } catch(Exception e) {
            }
        }
        double time;
        while( true ) {
            System.out.println("Podaj czas:");
            String meanwhile = key.nextLine();
            try {
                time = Integer.parseInt(meanwhile);
                if (time < 1) {

                } else {
                    break;
                }
            } catch (Exception e) {
            }
        }
        for (int x = 1; x < time+1; x++) {
            System.out.println(x+" "+speed*x);
        }
    }
}
