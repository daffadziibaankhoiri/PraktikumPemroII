package module01.problem04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pointAbu = 0;
        int pointBagas = 0;

        System.out.print("Tangan Abu : ");
        String[] abu = input.nextLine().split(" ");
        System.out.print("Tangan Bagas : ");
        String[] bagas = input.nextLine().split(" ");

        for (int i = 0; i < 3; i++) {
            if(!abu[i].equals(bagas[i])){
                if(abu[i].equals("B") && bagas[i].equals("G") || abu[i].equals("G") && bagas[i].equals("K") || abu[i].equals("K") && bagas[i].equals("B")){
                    pointAbu++;
                } else {
                    pointBagas++;
                }
            }
        }

        if(pointAbu == pointBagas){
            System.out.print("Seri");
        } else if(pointAbu < pointBagas){
            System.out.print("Bagas");
        } else {
            System.out.print("Abu");
        }
    }
}
