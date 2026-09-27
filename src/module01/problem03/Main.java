package module01.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int number = input.nextInt();
        int counter = 0;
        do {
            if (number % 2 != 0) {
                System.out.print(number + ", ");
                counter++;
            }
            number++;
        }while (counter < count);
    }
}
