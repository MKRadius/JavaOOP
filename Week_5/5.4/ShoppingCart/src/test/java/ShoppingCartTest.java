import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.example.*;

public class ShoppingCartTest {
    private static ShoppingCart cart;

    @BeforeAll
    public static void setup() {
        cart = new ShoppingCart();
    }
    
    @BeforeEach
    public void setupEach() {
        cart.clear();
    }

    @Test
    public void testAddItem() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        assertEquals(2, cart.getItemCount());
    }
    
    @Test
    public void testRemoveItem() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");
        assertEquals(1, cart.getItemCount());
    }
    
    @Test
    public void testCalculateTotal() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);
        assertEquals(2.25, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testClear() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.clear();
        assertEquals(0, cart.getItemCount());
    }
}

