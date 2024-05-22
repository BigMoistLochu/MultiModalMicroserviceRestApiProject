package projekt.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projekt.product.models.Product;
import projekt.product.repositories.ProductRepository;

@SpringBootApplication
public class ProductMicroserviceApplication implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Autowired
    public ProductMicroserviceApplication(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(ProductMicroserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product produkt1 = new Product(1L,"mleko");
        productRepository.save(produkt1);
    }
}