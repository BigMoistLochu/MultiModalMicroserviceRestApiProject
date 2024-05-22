package projekt.customer.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projekt.customer.models.Customer;
import projekt.customer.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CustomerRestController {

    private final CustomerService customerService;

    @Autowired
    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/customer/all")
    public List<Customer> showAllCustomers(){

        return customerService.getAllCustomers();
    }
}
