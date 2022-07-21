package com.example.springcompositedesignpattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class DemoController {

    @Resource
    private Map<String, Task> taskMap;

    @GetMapping
    public String index(@RequestParam String name) {
        System.out.println("In DemoController");
        System.out.println(taskMap.keySet());
        Task task = taskMap.get(name);
        task.doSomeThing();
        return "Printed";
    }
}
