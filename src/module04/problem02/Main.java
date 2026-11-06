package module04.problem02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Choose the type of animal you want to input: ");
            System.out.println("1 = Cat");
            System.out.println("2 = Dog");
            System.out.print("Enter yout choice: ");
            String choice = input.nextLine();

            System.out.print("Pet Name: ");
            String name = input.nextLine();
            System.out.print("Breed: ");
            String breed = input.nextLine();
            switch (choice){
                case "1":{
                    System.out.print("Fur: ");
                    String fur = input.nextLine();
                    Cat cat = new Cat(name, breed, fur);
                    cat.displayCatDetail();
                }
                    break;
                case "2":{
                    System.out.print("Fur: ");
                    String fur = input.nextLine();
                    System.out.print("Skill: ");
                    String[] skill = input.nextLine().split(", ");
                    Dog dog  = new Dog(name, breed, fur, skill);
                    dog.displayDogDetail();
                }
                    break;
            }
        }
    }
}
