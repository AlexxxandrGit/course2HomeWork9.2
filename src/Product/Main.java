package Product;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Product apple = new Product("Яблоко", 150, 1);
        Product mango = new Product("Манго", 300, 2);
        Product banana = new Product("Банан", 70, 3);
        Product kiwi = new Product("Киви", 350, 4);


        Recipe fruitSalad = new Recipe("Фруктовый салат");
        fruitSalad.addProductToList(banana);
        fruitSalad.addProductToList(mango);
        fruitSalad.addProductToList(kiwi);
        fruitSalad.addProductToList(kiwi);


        System.out.println(fruitSalad);
        System.out.println(fruitSalad.getTotalCostAllProducts());



    }


}
