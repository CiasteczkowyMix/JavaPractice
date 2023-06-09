import java.util.Locale;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        /*int bok;
        while( true ){
            String boczek = key.nextLine();
            try {
                bok = Integer.parseInt(boczek);
                break;
            } catch(Exception e) {
                System.out.print(e);
            }
        }
        */
        String[] rzymLicz= {"M","D","C","L","X","V","I"};
        String a = "MMDCDMD";
        for(char ch: a.toCharArray()) {
            if(ch != 'M' && ch != 'D' && ch != 'C' && ch != 'L' && ch != 'X' && ch != 'V' && ch != 'I'){
                System.out.println(ch);
            }
        }
        if(a.length() > 15);
        int count = a.length() - a.replace("M", "").length();
        System.out.println(count);
        if(a.lastIndexOf(rzymLicz[0]) > a.indexOf(rzymLicz[2]));


    }

}