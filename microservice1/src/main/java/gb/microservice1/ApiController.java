package gb.microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Привет от микросервиса № 1";
    }
}