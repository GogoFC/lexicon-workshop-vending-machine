package se.lexicon.model;

import java.util.ArrayList;

public interface VendingMachine {

    void addCurrency(int amount);
    int getBallance();

    InterfaceProduct request(int id);

    int endSession();

    String getDescription(int id);

    String getProducts();



}
