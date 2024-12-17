package com.example;

import com.example.data.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        if (args.length < 2) {
            logger.error("Arguments missing! Please provide name and age.");
            return;
        }
        
        // 引数を利用してPersonオブジェクトを作成
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        Person person = new Person(name, age);  // Personオブジェクトの作成

        // Greeterオブジェクトを作成し、greetメソッドを呼び出し
        Greeter greeter = new Greeter();
        String greeting = greeter.greet(person);  // Personオブジェクトを渡す

        // ログ出力
        logger.info(greeting);
    }
}
