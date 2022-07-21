package com.example.springcompositedesignpattern;

import org.springframework.stereotype.Component;

@Component
public class PrintWorldTask implements Task{
    @Override
    public void doSomeThing() {
        System.out.println("World!");
    }
}
