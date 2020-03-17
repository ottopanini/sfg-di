package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingSerivceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setup() {
        controller = new PropertyInjectedController();
        controller.greetingSerivce = new GreetingSerivceImpl();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}