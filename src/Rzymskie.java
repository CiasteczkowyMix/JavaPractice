import java.util.Scanner;

public class Rzymskie {
    public static String[] rzymLicz= {"M","D","C","L","X","V","I"};
    public static Scanner key = new Scanner(System.in);
    public static void toArabskie() {
        String liczbaRzymska = "M";
        int output = 0;
        while(true) {
            output = 0;
            System.out.println("Podaj liczbę rzymską:");
            liczbaRzymska = key.nextLine();
            liczbaRzymska = liczbaRzymska.toUpperCase();
            for(int x = 0; x < liczbaRzymska.length(); x++) {
                switch(liczbaRzymska.charAt(x)) {
                    case 'M':
                        output+=1000;
                        break;
                    case 'D':
                        output+=500;
                        break;
                    case 'C':
                        if(liczbaRzymska.indexOf("C") < liczbaRzymska.lastIndexOf("M")){
                            output+=900;
                            x++;
                        }else if (liczbaRzymska.indexOf("C") < liczbaRzymska.lastIndexOf("D")){
                            output+= 400;
                            x++;
                        }
                        else {
                            output+=100;
                        }
                        break;
                    case 'L':
                        output+= 50;
                        break;
                    case 'X':
                        if(liczbaRzymska.indexOf("X") < liczbaRzymska.lastIndexOf("C")){
                            output+=90;
                            x++;
                        }else if (liczbaRzymska.indexOf("X") < liczbaRzymska.lastIndexOf("L")){
                            output+= 40;
                            x++;
                        }
                        else {
                            output+=10;
                        }
                        break;
                    case 'V':
                        output += 5;
                        break;
                    case 'I':
                        if(liczbaRzymska.indexOf("I") < liczbaRzymska.lastIndexOf("X")){
                            output+=9;
                            x++;
                        }else if (liczbaRzymska.indexOf("I") < liczbaRzymska.lastIndexOf("V")){
                            output+=4;
                            x++;
                        }
                        else {
                            output+=1;
                        }
                        break;
                }
            }
            System.out.println(liczbaRzymska);
            System.out.println(rzymskieCheck(output));
            System.out.println(output);
        if(liczbaRzymska.equals(rzymskieCheck(output)) && output < 4000 && output > 0) break;
        }
        System.out.println(output);
    }
    public static String rzymskieCheck(int liczba) {
        String nova="";
        int count=0;
        while(liczba > 0) {
            if(liczba >= 1000){
                for(int x = 0; x < liczba/1000;x++) {
                    nova += rzymLicz[0];
                    count++;
                }
                liczba = liczba - 1000*count;
            } else if (liczba >= 100) {
                switch (liczba/100) {
                    case 9:
                        nova += rzymLicz[2] + rzymLicz[0];
                        liczba -= 900;
                        break;
                    case 8:
                        nova += rzymLicz[1] + rzymLicz[2] + rzymLicz[2] + rzymLicz[2];
                        liczba -= 800;
                        break;
                    case 7:
                        nova += rzymLicz[1] + rzymLicz[2] + rzymLicz[2];
                        liczba -= 700;
                        break;
                    case 6:
                        nova += rzymLicz[1] + rzymLicz[2];
                        liczba -= 600;
                        break;
                    case 5:
                        nova += rzymLicz[1];
                        liczba -= 500;
                        break;
                    case 4:
                        nova += rzymLicz[2] + rzymLicz[1];
                        liczba -= 400;
                        break;
                    case 3:
                        nova += rzymLicz[2] + rzymLicz[2] + rzymLicz[2];
                        liczba -= 300;
                        break;
                    case 2:
                        nova += rzymLicz[2] + rzymLicz[2];
                        liczba -= 200;
                        break;
                    case 1:
                        nova += rzymLicz[2];
                        liczba -= 100;
                        break;
                }
            } else if (liczba >= 10) {
                switch (liczba/10) {
                    case 9:
                        nova += rzymLicz[4] + rzymLicz[2];
                        liczba -= 90;
                        break;
                    case 8:
                        nova += rzymLicz[3] + rzymLicz[4] + rzymLicz[4] + rzymLicz[4];
                        liczba -= 80;
                        break;
                    case 7:
                        nova += rzymLicz[3] + rzymLicz[4] + rzymLicz[4];
                        liczba -= 70;
                        break;
                    case 6:
                        nova += rzymLicz[3] + rzymLicz[4];
                        liczba -= 60;
                        break;
                    case 5:
                        nova += rzymLicz[3];
                        liczba -= 50;
                        break;
                    case 4:
                        nova += rzymLicz[4] + rzymLicz[3];
                        liczba -= 40;
                        break;
                    case 3:
                        nova += rzymLicz[4] + rzymLicz[4] + rzymLicz[3];
                        liczba -= 30;
                        break;
                    case 2:
                        nova += rzymLicz[4] + rzymLicz[4];
                        liczba -= 20;
                        break;
                    case 1:
                        nova += rzymLicz[4];
                        liczba -= 10;
                        break;
                }
            } else {
                switch (liczba) {
                    case 9:
                        nova += rzymLicz[6] + rzymLicz[4];
                        liczba -= 9;
                        break;
                    case 8:
                        nova += rzymLicz[5] + rzymLicz[6] + rzymLicz[6] + rzymLicz[6];
                        liczba -= 8;
                        break;
                    case 7:
                        nova += rzymLicz[5] + rzymLicz[6] + rzymLicz[6];
                        liczba -= 7;
                        break;
                    case 6:
                        nova += rzymLicz[5] + rzymLicz[6];
                        liczba -= 6;
                        break;
                    case 5:
                        nova += rzymLicz[5];
                        liczba -= 5;
                        break;
                    case 4:
                        nova += rzymLicz[6] + rzymLicz[5];
                        liczba -= 4;
                        break;
                    case 3:
                        nova += rzymLicz[6] + rzymLicz[6] + rzymLicz[6];
                        liczba -= 3;
                        break;
                    case 2:
                        nova += rzymLicz[6] + rzymLicz[6];
                        liczba -= 2;
                        break;
                    case 1:
                        nova += rzymLicz[6];
                        liczba -= 1;
                        break;
                }
            }
        }
        return(nova);
    }
    public static void toRzymskie() {
        int liczba;
        while( true){
            System.out.println("Podaj liczbę arabską:");
            String meanwhile = key.nextLine();
            try {
                liczba = Integer.parseInt(meanwhile);
                if(liczba < 3999 && liczba > 0) break;
            } catch(Exception e) {
            }
        }
        String nova="";
        int count=0;
        while(liczba > 0) {
            if(liczba >= 1000){
                for(int x = 0; x < liczba/1000;x++) {
                    nova += rzymLicz[0];
                    count++;
                }
                liczba = liczba - 1000*count;
            } else if (liczba >= 100) {
                switch (liczba/100) {
                    case 9:
                        nova += rzymLicz[2] + rzymLicz[0];
                        liczba -= 900;
                        break;
                    case 8:
                        nova += rzymLicz[1] + rzymLicz[2] + rzymLicz[2] + rzymLicz[2];
                        liczba -= 800;
                        break;
                    case 7:
                        nova += rzymLicz[1] + rzymLicz[2] + rzymLicz[2];
                        liczba -= 700;
                        break;
                    case 6:
                        nova += rzymLicz[1] + rzymLicz[2];
                        liczba -= 600;
                        break;
                    case 5:
                        nova += rzymLicz[1];
                        liczba -= 500;
                        break;
                    case 4:
                        nova += rzymLicz[2] + rzymLicz[1];
                        liczba -= 400;
                        break;
                    case 3:
                        nova += rzymLicz[2] + rzymLicz[2] + rzymLicz[2];
                        liczba -= 300;
                        break;
                    case 2:
                        nova += rzymLicz[2] + rzymLicz[2];
                        liczba -= 200;
                        break;
                    case 1:
                        nova += rzymLicz[2];
                        liczba -= 100;
                        break;
                }
            } else if (liczba >= 10) {
                switch (liczba/10) {
                    case 9:
                        nova += rzymLicz[4] + rzymLicz[2];
                        liczba -= 90;
                        break;
                    case 8:
                        nova += rzymLicz[3] + rzymLicz[4] + rzymLicz[4] + rzymLicz[4];
                        liczba -= 80;
                        break;
                    case 7:
                        nova += rzymLicz[3] + rzymLicz[4] + rzymLicz[4];
                        liczba -= 70;
                        break;
                    case 6:
                        nova += rzymLicz[3] + rzymLicz[4];
                        liczba -= 60;
                        break;
                    case 5:
                        nova += rzymLicz[3];
                        liczba -= 50;
                        break;
                    case 4:
                        nova += rzymLicz[4] + rzymLicz[3];
                        liczba -= 40;
                        break;
                    case 3:
                        nova += rzymLicz[4] + rzymLicz[4] + rzymLicz[3];
                        liczba -= 30;
                        break;
                    case 2:
                        nova += rzymLicz[4] + rzymLicz[4];
                        liczba -= 20;
                        break;
                    case 1:
                        nova += rzymLicz[4];
                        liczba -= 10;
                        break;
                }
            } else {
                switch (liczba) {
                    case 9:
                        nova += rzymLicz[6] + rzymLicz[4];
                        liczba -= 9;
                        break;
                    case 8:
                        nova += rzymLicz[5] + rzymLicz[6] + rzymLicz[6] + rzymLicz[6];
                        liczba -= 8;
                        break;
                    case 7:
                        nova += rzymLicz[5] + rzymLicz[6] + rzymLicz[6];
                        liczba -= 7;
                        break;
                    case 6:
                        nova += rzymLicz[5] + rzymLicz[6];
                        liczba -= 6;
                        break;
                    case 5:
                        nova += rzymLicz[5];
                        liczba -= 5;
                        break;
                    case 4:
                        nova += rzymLicz[6] + rzymLicz[5];
                        liczba -= 4;
                        break;
                    case 3:
                        nova += rzymLicz[6] + rzymLicz[6] + rzymLicz[6];
                        liczba -= 3;
                        break;
                    case 2:
                        nova += rzymLicz[6] + rzymLicz[6];
                        liczba -= 2;
                        break;
                    case 1:
                        nova += rzymLicz[6];
                        liczba -= 1;
                        break;
                }
            }
        }
        System.out.println(nova);
    }
    public static void main(String[] args) {
        //MMMCMXCIX
                //3999
        while(true) {
            int wybor;
            while(true) {
                System.out.println("Liczby arabskie->rzymskie(1)\n" +
                        "liczby rzymskie->arabskie(2)\nQUIT(0)");
                String meanwhile = key.nextLine();
                try {
                    wybor = Integer.parseInt(meanwhile);
                    if (wybor == 1 || wybor == 2 || wybor == 0) break;
                } catch (Exception e) {
                }
            }
            if(wybor == 1){
                toRzymskie();
            } else if(wybor == 2) {
                toArabskie();
            } else {
                break;
            }
        }

    }
}
