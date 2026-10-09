package module02.problem01;

public class Fruit {
    private String name;
    private double weight;
    private double price;

    private double pricePerKg;
    private double purchaseAmount;
    public Fruit(String name, double weight,double price, double purchaseAmount) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.purchaseAmount = purchaseAmount;
        this.pricePerKg = price / weight;
    }

    public void printInfo() {
        System.out.println("Nama Buah: " + name);
        System.out.println("Berat: " + weight);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah Beli: " + purchaseAmount + "Kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f", getPreDiscountPrice());
        System.out.printf("\nTotal Diskon: Rp%.2f", getDiscountTotal());
        System.out.printf("\nHarga Setelah Diskon: Rp%.2f", getPostDiscountPrice());
        System.out.println("\n");

    }

    public double getPreDiscountPrice() {
        return purchaseAmount / weight * price;
    }

    public double getDiscountTotal() {
        int discountThreshold = 4;
        double discountPercentage = 0.02;
        int discountBatches = (int) (this.purchaseAmount /discountThreshold);
        return discountBatches * (this.pricePerKg * discountThreshold) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}
