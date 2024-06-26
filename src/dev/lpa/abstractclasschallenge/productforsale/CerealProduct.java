package dev.lpa.abstractclasschallenge.productforsale;

public class CerealProduct extends ProductForSale {
    public CerealProduct(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName()+": "+ type);
        System.out.printf("Price of product $%6.2f%n", price);
        System.out.println(description);
    }
}
