import java.util.*;

public class leetcode1352 {
    
}

class ProductOfNumbers {
    private final List<Integer> prefix;

    public ProductOfNumbers() {
        prefix = new ArrayList<>();
        prefix.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            prefix.clear();
            prefix.add(1);
        } else {
            int last = prefix.get(prefix.size() - 1);
            prefix.add(last * num);
        }
    }

    public int getProduct(int k) {
        int n = prefix.size();
        if (k >= n) {
            return 0;
        }
        int totalProduct = prefix.get(n - 1);
        int beforeWindowProduct = prefix.get(n - 1 - k);
        return totalProduct / beforeWindowProduct;
    }
}