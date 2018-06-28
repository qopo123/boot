package com.hua.springboot.boot.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

  private Object target; //要进行代理的业务类的实例
  public ProxyHandler(Object target){
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    System.out.println("Object target proxy:"+target);
    System.out.println("模拟代理加强的方法...");
    Object invoke = method.invoke(target, args);
    System.out.println("模拟代理加强的结束...");
    return invoke;
  }
}
