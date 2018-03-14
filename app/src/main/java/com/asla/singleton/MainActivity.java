package com.asla.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 单例模式：只需创建一个单例，该单例将应用于整个系统
         * 当访问数据库或者进行IO操作的时候使用
         *
         * 特点：
         * 1.构造方法私有化
         * 2.通过一个静态方法或枚举类型返回实例化的对象
         * 3.只有一个单例对象，保证多线程情况下的线程安全
         * 4.确保反序列化的时候不会重创对象
         *
         * 最建议使用Singleton2和Singleton3
         */
        Singleton2 singleton2=Singleton2.getInstance();

    }
}
