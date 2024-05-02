package se.lexicon;

import se.lexicon.model.InterfaceProduct;
import se.lexicon.model.VendingMachine;

public class Main {
    public static void main(String[] args) {

    Drink coke = new Drink("Coca Cola","Small",200);
//        System.out.println(coke.getId());
        Drink pepsi = new Drink("Pepsi","Large",100);
//        System.out.println(pepsi.getId());
  //      coke.examine();
    //    coke.use();


        VendingMachineImpl Impl = new VendingMachineImpl();
        Impl.addProduct(coke);
        Impl.addProduct(pepsi);
        Impl.addCurrency(200);
        Impl.addCurrency(200);
        Impl.addProduct(coke);


        System.out.println(Impl.getBallance());
        InterfaceProduct cc = Impl.request(coke.getId());
 //       System.out.println(Impl.getBallance());


        cc.examine();
        Impl.endSession();
        System.out.println(Impl.getBallance());


//        String productInformation = Impl.getProducts();

//        System.out.println(productInformation);
    }
}