package module02.problem02;

public class Coffee {


    private String name;
    private String size;
    private double price;
    private String customer;


    public void printInfo() {
        System.out.println("Coffee Name: " + getName());
        System.out.println("Size: " + getSize());
        System.out.println("Price: " + getPrice());

    }

    public double getTax(){
        return price * ((double) 11 / 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

}
