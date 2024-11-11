package org.example.springdemo.inherit.ctx1;

import org.springframework.stereotype.Service;

@Service
public class Service1 {

    public Service1() {
        System.out.println("┌--- Service1 ---┐");
        System.out.println("├  constructor   ┤");
        System.out.println("└----------------┘");
    }
}
