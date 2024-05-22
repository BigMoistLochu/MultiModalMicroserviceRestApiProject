package projekt.product.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projekt.product.models.Product;
import projekt.product.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProductRestController {

    private final ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("product/all")
    public List<Product> showAllProductToApi(){

        return productService.getAllProducts();
    }
}
