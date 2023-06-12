import java.util.Scanner;

public class Hazard {
    public static String[] symbols = {"Makak","Lemur","Goryl","Wyjec"};
    public static int spin(int a){
        int out = 0;
        int[] wheelSymbols = {9,9,9};
        for(int x = 0;x < a; x++) {
            wheelSymbols[x] = (int) (Math.random() * symbols.length);
            System.out.println(symbols[wheelSymbols[x]]);
        }
        for(int d : wheelSymbols){
            for(int dd : wheelSymbols){
                if(d == dd){
                    out++;
                }
            }
        }
        out = (int)Math.sqrt(out);
        return out;
    }
    public static int win(int a, int bet){
        System.out.println(bet*a);
        return bet*a;
    }
    public static void lose() {
        System.out.println("There is no money for you");
    }
    public static void bye(int a,int money) {
        switch (a) {
            case 0:
                System.out.println("U r broken!");
                break;
            case 1:
                System.out.println("Bravo!\nYou left with "+money+"$$$");
            default:
                System.out.println("See you next time!");
        }
    }
    public static void print() {
        System.out.println("   ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n"+
                " ▄▀▒▒▀▀▄▄▒▒▒▒▒▒▒▒▒▒▀▀▄▄\n"+
                "▄▀▒▒▒▒▒▒▒▀▀▄▄▄▄▄▄▄▄▄▄▄▄██▄\n" +
                "█▀▄▄▒▒▒▒▒▄▀▓▓▓/\\▓▓▓▓▓▓▓O▓▓▀▄\n" +
                "█░░░▀▀▄▄▄▀▓▓▓//\\\\▓▓▓▓▓_║_▓▓▀▄\n" +
                "█░░░░░░█▓▓▓▓//──\\\\▓▓▓|___|▓▓▓█\n" +
                "█░░@░░░█▓▓▓┌─────────────┐▓▓▓█\n" +
                "█░░║░░░█▓▓▓│░░░░░░░░░░░░░│▓▓▓█\n" +
                "█░░║░░░█▓»▓│░░░░░░░░░░░░░│▓«▓█\n" +
                "█░░╩░░░█▓▓▓│░░░░░░░░░░░░░│▓▓▓█\n" +
                "█░░░░░░█▓▓▓└─────────────┘▓▓▓█\n" +
                "█░░░░░░█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n" +
                "█░░░░░░█▓▓▓▓▓▓╔═════╗▓▓▓▓. ° █\n" +
                "█░■░■░░█▓▓▓▓▓▓║Prize║▓▓0▓°'▓▓█\n" +
                "█░■░■░■█▓▓▓▓▓▓╚═════╝▓▓╚>▓U▓▓█\n" +
                "▀▄░░■░■█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n" +
                "  ▀▀▄▄░█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n" +
                "      ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
    }
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int option;
        boolean game;
        while( true ){
            System.out.println("Play(1)\nQuit(0)");
            String meanwhile = key.nextLine();
            try {
                option = Integer.parseInt(meanwhile);
                if(option != 0 && option != 1){

                }else {
                    if(option == 1) {
                        game = true;
                    } else {
                        game = false;
                    }
                    break;
                }
            } catch(Exception e) {
            }
        }
        int money = 200;
        int bet;
        while(game) {
            while( true ){
                print();
                System.out.println("Ile obstawiasz?");
                String meanwhile = key.nextLine();
                if(meanwhile.equalsIgnoreCase("all") ||
                        meanwhile.equalsIgnoreCase("all in") ||
                        meanwhile.equalsIgnoreCase("allin")){
                    bet = money;
                    break;
                }else {
                    try {
                        bet = Integer.parseInt(meanwhile);
                        if(bet > money){
                            System.out.println("Nie gramy na kredyt\nMasz tylko: "+money);
                        }else if(bet < 1){
                            System.out.println("Kto nie płaci, ten tylko traci!");
                            money -= 10;
                            System.out.println("Current money: "+money);
                        }else {
                            break;
                        }
                    } catch(Exception e) {
                    }
                }
            }
            money -= bet;
            int score = spin(3);
            if(score == 1) {
                lose();
            }else {
                money += win(score,bet);
            }
            System.out.println("You have "+money+" $$$");
            if(money<=0) {
                System.out.println("You lost all money!");
                bye(0,money);
                break;
            }
            while (true) {
                System.out.println("Play again(1)\nQuit(0)");
                String meanwhile = key.nextLine();
                try {
                    option = Integer.parseInt(meanwhile);
                    if (option != 0 && option != 1) {

                    } else {
                        if (option == 1) {
                            game = true;
                        } else {
                            bye(1,money);
                            game = false;
                        }
                        break;
                    }
                } catch (Exception e) {
                }
            }
        }

    }
}
