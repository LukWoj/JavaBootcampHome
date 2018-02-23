package logic;

import java.util.Set;
import java.util.TreeSet;

public class ProductBasket {

    private Set<Product> products;

    public ProductBasket() {
        products = new TreeSet<Product>(new PriceComparator());
    }

    public Set<Product> getProducts() {
        return products;
    }
}
