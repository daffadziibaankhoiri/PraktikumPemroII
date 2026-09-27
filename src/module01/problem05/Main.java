package module01.problem05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PHI = 3.14;
        System.out.print("Masukkan jari-jari : ");
        double radius = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double height = input.nextDouble();

        double cylinderVolume = PHI * radius * radius * height;
        System.out.printf("Volume tabung dengan jari jari %.1f cm  dann tinggi %.1f cm adalah %.3f m3", radius, height, cylinderVolume);
    }
}
