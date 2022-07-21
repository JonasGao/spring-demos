package com.example.springcompositedesignpattern;

import org.springframework.stereotype.Component;

@Component
public class PrintHelloTask implements Task{
    @Override
    public void doSomeThing() {
        System.out.println("Hello");
    }
}
