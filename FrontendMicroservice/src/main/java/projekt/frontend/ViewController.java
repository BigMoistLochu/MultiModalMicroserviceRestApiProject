package projekt.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/page")
    public String getMainPage(){

        return "main";
    }


}
