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
        String[] Bagas = input.nextLine().split(" ");

//        for (int i = 0; i < 3; i++) {
//            if(!abu[i].equals(Bagas[i])){
//                if(abu[i].equals("B") && Bagas[i].equals("G")){
//                    pointAbu++;
//                } else if (abu[i].equals("G") && Bagas[i].equals("B")){
//                    pointBagas++;
//                } else if(abu[i].equals("G") && Bagas[i].equals("K")){
//                    pointAbu++;
//                } else if (abu[i].equals("K") && Bagas[i].equals("G")){
//                    pointBagas++;
//                } else  if(abu[i].equals("K") && Bagas[i].equals("B")){
//                    pointAbu++;
//                } else  if(abu[i].equals("B") && Bagas[i].equals("K")){
//                    pointBagas++;
//                }
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            if(!abu[i].equals(Bagas[i])){
//                if(abu[i].equals("B") && Bagas[i].equals("G")){
//                    pointAbu++;
//                } else if(abu[i].equals("G") && Bagas[i].equals("K")){
//                    pointAbu++;
//                } else if(abu[i].equals("K") && Bagas[i].equals("B")){
//                    pointAbu++;
//                } else {
//                    pointBagas++;
//                }
//            }
//        }

        for (int i = 0; i < 3; i++) {
            if(!abu[i].equals(Bagas[i])){
                if(abu[i].equals("B") && Bagas[i].equals("G") || abu[i].equals("G") && Bagas[i].equals("K") || abu[i].equals("K") && Bagas[i].equals("B")){
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
