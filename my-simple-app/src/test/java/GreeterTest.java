package com.example;

import com.example.data.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test
    void testGreet() {
        Greeter greeter = new Greeter();
        Person person = new Person("Kent", 25);  // Personオブジェクトを作成
        String result = greeter.greet(person);  // Personオブジェクトを渡す
        assertEquals("Hello Kent, you are 25 years old.", result);
    }
}
