package org.example.springdemo.inherit.ctx1;

import org.example.springdemo.inherit.ctx2.Ctx2ChildContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringDemoApplication.class);
        SpringApplicationBuilder child2 = builder.child(Ctx2ChildContext.class);
        SpringApplicationBuilder child1 = child2.child(Ctx1ChildContext.class);
        child1.run();
    }

}
