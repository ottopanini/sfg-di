package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingSerivce;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingSerivce greetingSerivce;

    public ConstructorInjectedController(@Qualifier("constructorGreetingSerivce") GreetingSerivce greetingSerivce) {
        this.greetingSerivce = greetingSerivce;
    }

    public String getGreeting() {
        return greetingSerivce.sayGreeting();
    }
}
