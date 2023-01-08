package Product;

import java.util.HashMap;
import java.util.Map;

public final class Recipe {

    private final Map<Product, Integer> products = new HashMap<>();

    private final String recipeName;

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }

    public void addProductToList(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.containsKey(product)) {
            Integer productCount = this.products.get(product);
            this.products.put(product, ++productCount);

        } else {
            this.products.put(product, 1);
        }

    }

    public double getTotalCostAllProducts() {
        double sum = 0.0;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            sum += product.getKey().getPrice() * product.getValue();

        }
        return sum;
    }


    @Override
    public String toString() {
        return "Recipe{" +
                "products=" + products +
                ", recipeName='" + recipeName + '\'' +
                '}';
    }
}
