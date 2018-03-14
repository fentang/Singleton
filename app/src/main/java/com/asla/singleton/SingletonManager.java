package com.asla.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangfen on 2018/3/14.
 */

/**
 * 容器管理单例模式
 *
 * 在一开始的时候把所有的实例注入到这个容器管理的类中，以后每次需要的时候就从该容器中取出实例，
 * 统一了用户操作的接口，降低了用户成本，隐藏了具体实现，降低了耦合度
 */

public class SingletonManager {
    private static Map<String,Object> objectMaps=new HashMap<>();
    public void putObj(String key,Object instance){
        if(!objectMaps.containsKey(key)){
            objectMaps.put(key,instance);
        }
    }

    public Object getObj(String key){
        return objectMaps.get(key);
    }
}
