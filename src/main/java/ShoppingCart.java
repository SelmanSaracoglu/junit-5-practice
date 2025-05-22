import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Product, Integer> items = new HashMap<>();

    public void addItem(Product product, int quantity){
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }
    public void removeItem(Product product){
        items.remove(product);
    }
    public int getTotalItems(){
        return items.values().stream().mapToInt(Integer::intValue).sum();
    }
}
