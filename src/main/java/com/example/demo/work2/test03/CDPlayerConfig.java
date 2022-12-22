package com.example.demo.work2.test03;

import org.springframework.context.annotation.Bean;

public class CDPlayerConfig {

    @Bean
    public Mayday mayday(){
        //生成bean的名字默认是compactDisc
        return new Mayday();
    }

//    @Bean
//    public CDPlayer cdPlayer(){
///*        因为mayday()方法上面加了bean注解，所以Spring会拦截所有对该方法的调用，直接返回该方法创建的bean。
//        默认情况下Spring中的bean是单例的，可以将一个实例注入到任意数量的bean中，所有调用该方法得到的bean都是同一个。*/
//        return new CDPlayer(mayday());
//    }

    @Bean
    public  CDPlayer cdPlayer(Mayday mayday){
        /*当Spring调用cdPlayer()创建CDPlayer的bean的时候，会自动装配一个CompactDisc到配置方法中，
        不用明确引用CompactDisc的@Bean方法,这里注入的是上面第一个mayday方法生成的bean。*/
        return new CDPlayer(mayday);
    }



}
