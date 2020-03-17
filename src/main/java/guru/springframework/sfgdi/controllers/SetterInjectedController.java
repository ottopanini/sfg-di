package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingSerivce;

public class SetterInjectedController {
    private GreetingSerivce greetingSerivce;

    public String getGreeting() {
        return greetingSerivce.sayGreeting();
    }

    public void setGreetingSerivce(GreetingSerivce greetingSerivce) {
        this.greetingSerivce = greetingSerivce;
    }
}
