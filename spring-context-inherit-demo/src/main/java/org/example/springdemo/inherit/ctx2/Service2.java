package org.example.springdemo.inherit.ctx2;

import org.springframework.stereotype.Service;

@Service
public class Service2 {

    public Service2() {
        System.out.println("┌--- Service2 ---┐");
        System.out.println("├  constructor   ┤");
        System.out.println("└----------------┘");
    }
}
