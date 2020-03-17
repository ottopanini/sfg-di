package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingSerivceImpl implements GreetingSerivce {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
