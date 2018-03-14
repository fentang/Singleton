package com.asla.singleton;

/**
 * Created by tangfen on 2018/3/14.
 */

/**
 * 静态内部类单例模式
 * 加载Singleton3时不会实例化单例对象，只有在调用getInstance时才会实例化对象
 * 优点：线程安全，保证单例对象的唯一，同时也延缓了对象的实例化
 * 最推荐的一种方法
 */
public class Singleton3 {

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        return Singleton3.Holder.instance;
    }

    private static class Holder{
        private final static Singleton3 instance=new Singleton3();
    }
}
