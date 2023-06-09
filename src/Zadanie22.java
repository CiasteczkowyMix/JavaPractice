public class Zadanie22 {
    public static void main(String[] args) {
        int liczbaAkcji = 1000;
        double cenaKupna = 32.87;
        double cenaSprzedazy = 33.92;
        double prowizja = 0.02;
        double zaplata = liczbaAkcji*cenaKupna + liczbaAkcji*cenaKupna*prowizja;
        double zysk = liczbaAkcji*cenaSprzedazy*(1-prowizja) - zaplata;
        System.out.println("Jacek zapłacił za akcje: "+liczbaAkcji*cenaKupna+
                "\nZapłacił brokerowi: "+liczbaAkcji*cenaKupna*prowizja+" złotych"+
                "\nOtrzymał po sprzedaży: "+liczbaAkcji*cenaSprzedazy+" złotych"+
                "\nZapłacił brokerowi: "+liczbaAkcji*cenaSprzedazy*prowizja+" złotych"+
                "\nJacek zyskał: "+ zysk +" złotych");
    }
}
