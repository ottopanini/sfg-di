package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingSerivce;

public class PropertyInjectedController {
    public GreetingSerivce greetingSerivce;

    public String getGreeting() {
        return greetingSerivce.sayGreeting();
    }
}
