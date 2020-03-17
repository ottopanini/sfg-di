package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingSerivce;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingSerivce greetingSerivce;

    public MyController(GreetingSerivce greetingSerivce) {
        this.greetingSerivce = greetingSerivce;
    }

    public String sayHello() {
        return greetingSerivce.sayGreeting();
    }
}
