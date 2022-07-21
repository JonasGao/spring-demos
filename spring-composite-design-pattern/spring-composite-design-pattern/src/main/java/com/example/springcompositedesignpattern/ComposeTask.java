package com.example.springcompositedesignpattern;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

@Component
public class ComposeTask implements Task {

    @Resource
    private Map<String, Task> taskMap;

    @Override
    public void doSomeThing() {
        System.out.println("In ComposeTask");
        System.out.println(taskMap.keySet());
        taskMap.forEach((key, task) -> task.doSomeThing());
    }
}
