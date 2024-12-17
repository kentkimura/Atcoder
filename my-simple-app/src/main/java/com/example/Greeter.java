package com.example;

import com.example.data.Person;
import org.apache.commons.lang3.StringUtils;

public class Greeter {
    public String greet(Person person) {
        return "Hello " + person.getName() + ", you are " + person.getAge() + " years old.";
    }
}
