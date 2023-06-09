public class Zadanie18 {
    public static void main(String[] args) {
        int akcje = 600;
        double cenaAkcji = 21.77;
        double prowizja = 0.02;
        System.out.println("Łączna cena akcji: "+akcje*cenaAkcji+
                "\nWysokość prowizji: "+prowizja*akcje*cenaAkcji+
                "\nKwota do zapłaty: "+(akcje*cenaAkcji*(1+prowizja)));
    }
}
