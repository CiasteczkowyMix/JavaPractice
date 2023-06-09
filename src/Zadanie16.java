import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Jakie jest twoje ulubione miasto?");
        String miasto = key.nextLine();
        System.out.println("Liczba znaków w nazwie: "+miasto.length()+
                "\n"+miasto.toUpperCase()+
                "\n"+miasto.toLowerCase()+
                "\nPierwsza litera: "+miasto.charAt(0));
    }
}
