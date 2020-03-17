package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingSerivce greetingSerivce;

    public String getGreeting() {
        return greetingSerivce.sayGreeting();
    }

    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingSerivce(GreetingSerivce greetingSerivce) {
        this.greetingSerivce = greetingSerivce;
    }
}
