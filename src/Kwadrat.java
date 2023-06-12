import java.util.Scanner;

public class Kwadrat {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int bok;
        while( true ){
            System.out.println("Podaj długość boku(<15):");
            String meanwhile = key.nextLine();
            try {
                bok = Integer.parseInt(meanwhile);
                if(bok > 15 || bok < 1){

                }else {
                    break;
                }
            } catch(Exception e) {
            }
        }
        int output=0;
        int row;
        for (int x = 0; x < bok; x++){
            for (int y = 0; y < bok; y++){
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
