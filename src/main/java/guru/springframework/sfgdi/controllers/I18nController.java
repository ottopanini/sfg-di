package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingSerivce;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingSerivce greetingSerivce;

    public I18nController(@Qualifier("i18nService") GreetingSerivce greetingSerivce) {
        this.greetingSerivce = greetingSerivce;
    }

    public String sayHello() {
        return greetingSerivce.sayGreeting();
    }
}
