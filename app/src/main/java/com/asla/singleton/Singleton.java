package com.asla.singleton;

/**
 * Created by tangfen on 2018/3/14.
 */

/**
 * 饿汉模式
 * 在Singleton这个类初始化的时候就创建了单例对象
 * 缺陷：加载类的时候就初始化单例对象了，最消耗资源
 */
public class Singleton {
    private final static Singleton instance=new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}
