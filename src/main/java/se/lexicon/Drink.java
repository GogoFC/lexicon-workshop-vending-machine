package se.lexicon;

import se.lexicon.model.InterfaceProduct;

public class Drink implements InterfaceProduct {

    private static int id = 100;

    private int price;

    private String productName;

    private String size;






    public Drink(String productName, String size, int price) {
        this.price = price;
        this.productName = productName;
        this.size = size;
        id++;
        //id method needs to be static.
    }

    public void examine() {
        System.out.println(size + " " + productName + " " +  price + " SEK");

    }

    public void use() {
        System.out.println("Drink it and Enjoy");
    }

    public int getId() {
        return id;
    }


    public String getProductName() {
        return null;
    }

    public void setProductName(String productName) {

    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(double price) {

    }



}
