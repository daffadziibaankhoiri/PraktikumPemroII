package module04.problem02;

public class Dog extends Pet{
    private String fur;
    private String[] skill;

    public Dog(String name, String breed ,String fur, String[] skill) {
        super(name, breed);
        this.fur = fur;
        this.skill = skill;
    }
    public void displayDogDetail(){
        super.display();
        System.out.println("Fur : " + this.fur);
        System.out.print("Skill : ");
        for (String s : skill) {
            System.out.print(" " + s);
        }
        System.out.println(" \n");
    }
}
