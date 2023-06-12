import java.util.Scanner;

public class Kosci {
    public static void dice(int a) {
        switch (a) {
            case 1:
                System.out.print(
                        "⬜⬜⬜️\n" +
                        "⬜⬛⬜️\n" +
                        "⬜⬜⬜️\n");
                break;
            case 2:
                System.out.print(
                        "⬛⬜⬜️\n" +
                        "⬜⬜⬜️\n" +
                        "⬜⬜⬛️\n");
                break;
            case 3:
                System.out.print(
                        "⬛⬜⬜️\n" +
                        "⬜⬛⬜️\n" +
                        "⬜⬜⬛️\n");
                break;
            case 4:
                System.out.print(
                        "⬛⬜⬛️\n" +
                        "⬜⬜⬜️\n" +
                        "⬛⬜⬛️\n");
                break;
            case 5:
                System.out.print(
                        "⬛⬜⬛  \n" +
                        "⬜⬛⬜️\n" +
                        "⬛⬜⬛️\n");
                break;
            case 6:
                System.out.print(
                        "⬛⬜⬛️\n" +
                        "⬛⬜⬛️\n" +
                        "⬛⬜⬛️\n");
                break;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int option;
        boolean game = true;
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
        int playerPoints, computerPoints, playerRoll = 0, computerRoll = 0;
        while(game) {
            playerPoints = 0;
            computerPoints = 0;
            for(int x = 0; x < 10; x++) {
                System.out.println("Player roll:");
                playerRoll = (int)(Math.random() * 6) + 1;
                dice(playerRoll);
                System.out.println("Computer roll:");
                computerRoll = (int)(Math.random() * 6) + 1;
                dice(computerRoll);
                if(computerRoll > playerRoll) {
                    computerPoints++;
                } else if (playerRoll > computerRoll) {
                    playerPoints++;
                } else {
                    x--;
                }
                System.out.println("Punkty:\nComputer: "+computerPoints +
                        "   Player: "+playerPoints);
                System.out.println("Press {Enter} to continue");
                key.nextLine();
            }
            System.out.println("Game over");
            if(playerPoints > computerPoints) {
                System.out.println("You are the winner!\nWe can sleep safe, " +
                        "knowing that there is always luck, we have more than robots...");
            } else if (computerPoints > playerPoints) {
                System.out.println("You lost\n Machines supremacy is not a joke");
            } else {
                System.out.println("Both players came out equally lucky. " +
                        "Maybe next time they will try playing chess?");
            }
            while( true ){
                System.out.println("Play again(1)\nQuit(0)");
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
        }
        System.out.println("Play again sometime!");
    }
}
