package com.asla.singleton;

/**
 * Created by tangfen on 2018/3/14.
 */

/**
 * 枚举单例模式
 *
 * 优点：简单，不仅可以包括单例对象，还可以包括其他的方法，线程安全，而且在反序列化的时候不会重创对象
 */
public enum  SingletonEnum {
    INSTANCE;
}
