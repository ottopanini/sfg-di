package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingSerivce;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setup() {
        controller = new PropertyInjectedController();
        controller.greetingSerivce = new ConstructorGreetingSerivce();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}