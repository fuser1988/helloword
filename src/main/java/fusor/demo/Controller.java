package fusor.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api")
    public String buscarNombresUnicos() {
        return "TE amo mami, porque no me crees";
    }

}
