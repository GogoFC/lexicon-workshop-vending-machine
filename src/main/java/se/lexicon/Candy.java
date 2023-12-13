package se.lexicon;

import se.lexicon.model.InterfaceProduct;
public class Candy implements InterfaceProduct {

    private static int id = 1;

    private int price;

    private String productName;


    public void  examine() {

    }

    public void use() {

    }

    public int getId() {
        return id++;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return 0;
    }


    public void setPrice(double price) {

    }
}
