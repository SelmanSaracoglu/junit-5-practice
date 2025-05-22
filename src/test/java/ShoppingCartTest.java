import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    private ShoppingCart cart;

    private Product productA = new Product("Product A");
    private Product productC = new Product("Product C");

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
        // Her test için yeni sepet,
        // Yani testler sıfırdan başlıyor, birbirini etkilemiyor.
    }

    @Test
    public void addItem(){
        cart.addItem(productA, 2);
        cart.addItem(productC,3);
        Assertions.assertEquals(5, cart.getTotalItems(),"Cart should contain 5 items");
    }

    @Test
    public void removeItem(){
        cart.addItem(productA, 2);
        cart.addItem(productC,3);
        cart.removeItem(productA);
        Assertions.assertEquals(3, cart.getTotalItems(), "Cart should contain 3 item after removing Product A");
    }

    @AfterEach
    public void tearDown() {
        cart = null;
        //Bu adım, belleği temizlemek veya kodu daha okunabilir ve niyet odaklı hale getirmek için eklenebilir.
        //Zorunlu değil — çünkü zaten @BeforeEach her şeyi sıfırlıyor.
    }
}


