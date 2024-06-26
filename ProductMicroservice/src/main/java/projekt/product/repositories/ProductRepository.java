package projekt.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projekt.product.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
