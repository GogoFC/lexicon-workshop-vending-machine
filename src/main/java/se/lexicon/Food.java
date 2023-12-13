package se.lexicon;

import se.lexicon.model.InterfaceProduct;

public class Food implements InterfaceProduct {

    private static int id = 200;

    private int price;

    private String productName;


    public Food(int id, int price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    @Override
    public void examine() {

    }

    @Override
    public void use() {

    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getProductName() {
        return null;
    }

    @Override
    public void setProductName(String productName) {

    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {

    }
}
