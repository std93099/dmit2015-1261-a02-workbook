package dmit2015.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ProductTest {

    @Test
    void constructor_whenValid_storesName() {
        Product product = new Product("Laptop", 1200);

        assertThat(product.getName()).isEqualTo("Laptop");
    }
}