package com.asla.singleton;

/**
 * Created by tangfen on 2018/3/14.
 */

/**
 * 懒汉模式
 * 优点：类加载时没有初始化单例对象，相比较与饿汉模式，节省了资源
 * 缺点：1.第一次调用getInstance可能会造成卡顿的情况，
 *      2.每一次getInstance都会同步下对象，造成不必要的开销
 */
public class Singleton1 {
    private static Singleton1 instance;
    private  Singleton1(){

    }

    public static synchronized Singleton1 getInstance(){
        if(instance==null){
            instance=new Singleton1();
        }
        return instance;
    }
}
