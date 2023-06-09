import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double price;
        while( true ){
            System.out.println("Podaj cenę produktu:");
            String meanwhile = key.nextLine();
            try {
                price = Double.parseDouble(meanwhile);
                break;
            } catch(Exception e) {
            }
        }
        double podatekLokalny = 0.02, podatekStanowy = 0.04;

        System.out.println("Produkt o wartości " + price +
                " ma podatek stanowy w wysokości " + price*podatekStanowy +
                " i lokalny w wysokości "+price*podatekLokalny +
                ", za całość trzeba zapłacić "+Math.round(price+price*podatekLokalny+price*podatekStanowy));
    }
}
