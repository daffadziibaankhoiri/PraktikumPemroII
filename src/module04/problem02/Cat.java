package module04.problem02;

public class Cat extends Pet{
    private String fur;

    public Cat(String name, String breed, String fur) {
        super(name, breed);
        this.fur = fur;
    }

    public void displayCatDetail(){
        super.display();
        System.out.println("Fur: " + fur);
        System.out.println(" ");
    }
}
