package org.example.springdemo.inherit.ctx1;

import org.example.springdemo.inherit.ctx2.Service2;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class Run1 implements ApplicationRunner {

    private final ApplicationContext context;
    private final RedisTemplate<Object, Object> template;
    private final Service1 service1;
    private final Service2 service2;
    private final Service3 service3;

    public Run1(ApplicationContext context, RedisTemplate<Object, Object> template, Service1 service1, ObjectProvider<Service2> service2, Service3 service3) {
        this.context = context;
        this.template = template;
        this.service1 = service1;
        this.service2 = service2.getIfAvailable();
        this.service3 = service3;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("┌--- Run1 -----------------------------------");
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
