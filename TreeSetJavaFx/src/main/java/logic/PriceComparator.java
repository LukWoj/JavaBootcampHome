package logic;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        int prodComp = (int) (p1.getPrice() * 1000 - p2.getPrice() * 1000);
        return prodComp;
    }
}
