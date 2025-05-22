
import java.util.Objects;

public class Product {

    private String name;

    public  Product(String name){
        this.name = name;
    }
    // HashMap içinde kullanılabilmesi için equals() ve hashCode() override edilmeli

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }
}
