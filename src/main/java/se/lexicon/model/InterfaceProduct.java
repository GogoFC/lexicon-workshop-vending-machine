package se.lexicon.model;

public interface InterfaceProduct {


    public abstract void examine();
    public abstract void use();
    public abstract int getId();
    public abstract String getProductName();
    public abstract void setProductName(String productName);
    public abstract int getPrice();
    public abstract void setPrice(double price);



}
