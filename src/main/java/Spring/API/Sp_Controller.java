package Spring.API;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Sp_Controller {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
