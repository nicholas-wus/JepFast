package src.main.java.org.jepfast.web.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JepFastApplication {

    public static void main(String[] args) {
        SpringApplication.run(JepFastApplication.class, args);
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}


