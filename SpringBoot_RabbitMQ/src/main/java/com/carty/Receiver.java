//package com.carty;
//
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
////@RabbitListener(queues = "hello")//监听hello队列
//public class Receiver {
//
//    @RabbitHandler
//    public void process(String hello) {
//        System.out.println("Receiver : " + hello);
//    }
//
//}
