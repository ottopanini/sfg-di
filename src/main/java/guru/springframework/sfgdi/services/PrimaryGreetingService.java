package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingSerivce {
    @Override
    public String sayGreeting() {
        return "Hello World - from the PRIMARY bean";
    }
}
