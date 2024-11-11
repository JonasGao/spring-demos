```text
2024-11-11T11:29:48.068+08:00  INFO 44236 --- [spring-demo] [           main] o.e.s.i.ctx1.SpringDemoApplication       : Starting SpringDemoApplication using Java 17.0.5 with PID 44236 (C:\Users\udemo\IdeaProjects\spring-demo\target\classes started by udemo in C:\Users\udemo\IdeaProjects\spring-demo)
2024-11-11T11:29:48.070+08:00  INFO 44236 --- [spring-demo] [           main] o.e.s.i.ctx1.SpringDemoApplication       : No active profile set, falling back to 1 default profile: "default"
2024-11-11T11:29:48.265+08:00  INFO 44236 --- [spring-demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2024-11-11T11:29:48.266+08:00  INFO 44236 --- [spring-demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
2024-11-11T11:29:48.283+08:00  INFO 44236 --- [spring-demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 7 ms. Found 0 Redis repository interfaces.
┌--- Service1 ---┐
├  constructor   ┤
└----------------┘
┌--- Service3 ---┐
├  constructor   ┤
└----------------┘
2024-11-11T11:29:48.650+08:00  INFO 44236 --- [spring-demo] [           main] o.e.s.i.ctx1.SpringDemoApplication       : Started SpringDemoApplication in 0.772 seconds (process running for 1.1)
┌--- Run1 -----------------------------------
├- context.getApplicationName() = 
├- context.getDisplayName = org.springframework.context.annotation.AnnotationConfigApplicationContext@29ca3d04
├- context.getId() = spring-demo
├- template.toString() = org.springframework.data.redis.core.RedisTemplate@732f6050
├- service1.toString() = org.example.springdemo.inherit.ctx1.Service1@6fbc1bb
└--------------------------------------------
2024-11-11T11:29:48.662+08:00  INFO 44236 --- [spring-demo] [           main] o.e.s.i.ctx1.SpringDemoApplication       : No active profile set, falling back to 1 default profile: "default"
2024-11-11T11:29:48.701+08:00  INFO 44236 --- [spring-demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2024-11-11T11:29:48.701+08:00  INFO 44236 --- [spring-demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
2024-11-11T11:29:48.703+08:00  INFO 44236 --- [spring-demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 1 ms. Found 0 Redis repository interfaces.
┌--- Service2 ---┐
├  constructor   ┤
└----------------┘
2024-11-11T11:29:48.721+08:00  INFO 44236 --- [spring-demo] [           main] o.e.s.i.ctx1.SpringDemoApplication       : Started SpringDemoApplication in 0.069 seconds (process running for 1.171)
┌--- Run2 -----------------------------------
├- context.getApplicationName() = 
├- context.getDisplayName = org.springframework.context.annotation.AnnotationConfigApplicationContext@34332b8d
├- context.getId() = spring-demo-1
├- template.toString() = org.springframework.data.redis.core.RedisTemplate@732f6050
├- service1.toString() = org.example.springdemo.inherit.ctx1.Service1@6fbc1bb
├- service2.toString() = org.example.springdemo.inherit.ctx2.Service2@12b5736c
├- service3.toString() = org.example.springdemo.inherit.ctx1.Service3@539a138b
└--------------------------------------------

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.4)

2024-11-11T11:29:48.736+08:00  INFO 44236 --- [spring-demo] [           main] o.e.s.i.ctx1.SpringDemoApplication       : No active profile set, falling back to 1 default profile: "default"
2024-11-11T11:29:48.776+08:00  INFO 44236 --- [spring-demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2024-11-11T11:29:48.776+08:00  INFO 44236 --- [spring-demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
2024-11-11T11:29:48.778+08:00  INFO 44236 --- [spring-demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 1 ms. Found 0 Redis repository interfaces.
┌--- Service1 ---┐
├  constructor   ┤
└----------------┘
┌--- Service3 ---┐
├  constructor   ┤
└----------------┘
2024-11-11T11:29:48.798+08:00  INFO 44236 --- [spring-demo] [           main] o.e.s.i.ctx1.SpringDemoApplication       : Started SpringDemoApplication in 0.076 seconds (process running for 1.248)
┌--- Run1 -----------------------------------
├- context.getApplicationName() = 
├- context.getDisplayName = org.springframework.context.annotation.AnnotationConfigApplicationContext@67e25252
├- context.getId() = spring-demo-1-1
├- template.toString() = org.springframework.data.redis.core.RedisTemplate@732f6050
├- service1.toString() = org.example.springdemo.inherit.ctx1.Service1@5261ec9
└--------------------------------------------

```
