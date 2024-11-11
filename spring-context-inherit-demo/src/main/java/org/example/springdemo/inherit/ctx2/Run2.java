package org.example.springdemo.inherit.ctx2;

import org.example.springdemo.inherit.ctx1.Service1;
import org.example.springdemo.inherit.ctx1.Service3;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class Run2 implements ApplicationRunner {

    private final ApplicationContext context;
    private final RedisTemplate<Object, Object> template;
    private final Service1 service1;
    private final Service2 service2;
    private final Service3 service3;

    public Run2(ApplicationContext context, RedisTemplate<Object, Object> template, Service1 service1, Service2 service2, Service3 service3) {
        this.context = context;
        this.template = template;
        this.service1 = service1;
        this.service2 = service2;
        this.service3 = service3;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("┌--- Run2 -----------------------------------");
        System.out.println("├- context.getApplicationName() = " + context.getApplicationName());
        System.out.println("├- context.getDisplayName = " + context.getDisplayName());
        System.out.println("├- context.getId() = " + context.getId());
        System.out.println("├- template.toString() = " + template);
        System.out.println("├- service1.toString() = " + service1);
        System.out.println("├- service2.toString() = " + service2);
        System.out.println("├- service3.toString() = " + service3);
        System.out.println("└--------------------------------------------");
    }
}
