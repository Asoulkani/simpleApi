package ma.aso.simpleapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Value("${helloMessage}")
    String message;

    @GetMapping("v1/hello")
    public Response hello() {
        return new Response(message);
    }
}
