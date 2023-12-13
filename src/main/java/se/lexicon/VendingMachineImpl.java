package se.lexicon;

import se.lexicon.model.InterfaceProduct;
import se.lexicon.model.VendingMachine;

import javax.management.InstanceNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class VendingMachineImpl implements VendingMachine {

    ArrayList<InterfaceProduct> products;

    private final int[] depositList = {1,2,5,10,20,50,100,200,500,1000};

    private int depositPool;

    public VendingMachineImpl() {
        this.products = new ArrayList<>();
    }

    public void addCurrency(int amount) {
        if (Arrays.binarySearch(this.depositList, amount) < 0){
            throw new IllegalArgumentException("Not allowed");
        }
        this.depositPool += amount;
    }

    public int getBallance() {
        return this.depositPool;
    }

    public InterfaceProduct request(int id) {

        InterfaceProduct expectedProduct = this.getProduct(id);

        if (this.depositPool > expectedProduct.getPrice())
            return expectedProduct;
        else
            throw new IllegalArgumentException("You need more money");

    }


    public int endSession() {
        int dp = this.depositPool;
        this.depositPool = 0;
        return dp;
    }


    public String getDescription(int id) {
        String s  = "";
        for(InterfaceProduct p : this.products){
            if (p.getId() == id)
                return s += "productId: " + p.getId() + " ProductName: " + p.getProductName() + " ProductPrice: " + p.getPrice() + "\n";

        }
        return s;
    }

    private InterfaceProduct getProduct(int id) {
        for(InterfaceProduct p : this.products){
            if (p.getId() == id) {
               return p;
            }
        }
        throw new IllegalArgumentException("Illegal product");
    }

    public String getProducts() {
        String s  = "";
        for(InterfaceProduct p : this.products){
            s += "productId: " + p.getId() + " ProductName: " + p.getProductName() + " ProductPrice: " + p.getPrice() + "\n";
        }
        return s;
    }


    public void addProduct(InterfaceProduct product){
        this.products.add(product);
    }
}
