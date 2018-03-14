package com.asla.singleton;

/**
 * Created by tangfen on 2018/3/14.
 */

/**
 * DCL(Double Check Lock)双锁检查机制
 *
 * instance=new Singleton2();这句代码其实执行了3个步骤
 * 1.为Singleton2的实例分配内存空间
 * 2.调用Singleton2的构造方法，实例化成员变量
 * 3.将instance对象指向分配的内存空间(这时instance不为空了)
 * JDK1.5之前，这3步的执行顺序是不固定的，可能为1-2-3,也可能为1-3-2，如果是1-3-2,切换线程时，返回的instance就有问题了，
 * 所以在它之外加了synchronized这个关键字
 * JDK1.5之后加入了volatile关键字，解决了这个问题。即private volatile static Singleton2 instance=null;
 *   优点：资源利用率高，解决了多余的同步问题，保证多线程情况下的线程同步
 *   缺点：第一次调用getInstance时，加载缓慢，在高并发的情况下，可能会有缺陷
 */
public class Singleton2 {
    private static Singleton2 instance=null;
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        if(instance==null){
            synchronized (Singleton2.class){
                if(instance==null){
                    instance=new Singleton2();
                }
            }
        }
        return instance;
    }
}
