package module04.problem01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pet Name: ");
        String name = input.nextLine();
        System.out.print("Breed: ");
        String breed = input.nextLine();
        input.close();

        Pet pet = new Pet(name, breed);
        pet.display();
    }
}
