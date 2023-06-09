import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zadanie19 {
    public static void main(String[] args) {
        int ankietowani = 12467;
        double onceWeek = 0.14;
        double limeFan = 0.64;
        BigDecimal roundOnceWeek = new BigDecimal(onceWeek*ankietowani).setScale(1, RoundingMode.HALF_UP);
        double onceWeekPrint = roundOnceWeek.doubleValue();
        BigDecimal roundLimeFan = new BigDecimal(limeFan*ankietowani*onceWeek).setScale(1, RoundingMode.HALF_UP);
        double limeFanPrint = roundLimeFan.doubleValue();
        System.out.println(onceWeekPrint + " osób kupuje conajmniej jeden napój tygodniowo"+
                "\n"+limeFanPrint + " woli smak cytrynowy");
    }

}
