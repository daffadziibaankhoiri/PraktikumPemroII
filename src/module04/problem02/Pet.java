package module04.problem02;

public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void display() {

        System.out.println("\nDetail Pet :");
        System.out.println("My pet's name is : " + name);
        System.out.println("Breed: " + breed);
    }
}
