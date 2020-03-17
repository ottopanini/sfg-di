package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingSerivce implements GreetingSerivce {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
