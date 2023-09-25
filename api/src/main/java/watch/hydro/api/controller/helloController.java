package watch.hydro.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {

    @GetMapping
    public String olaMundo() {
        return "Hello Word boa boa ";
    }
}
