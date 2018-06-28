package com.hua.springboot.boot.proxy;

import com.hua.springboot.boot.proxy.impl.ForumServiceImpl;
import java.lang.reflect.Proxy;

public class DynamicProxy {


  public static void main(String[] args) {
    //被代理类
    ForumService forumService = new ForumServiceImpl();
    //handler处理类
    ProxyHandler proxyHandler = new ProxyHandler(forumService);
    //实现形式
    ForumService  o = (ForumService) Proxy.newProxyInstance(forumService.getClass().getClassLoader(),
        forumService.getClass().getInterfaces(), proxyHandler);
    o.removeForum(11);
    o.removeTopic(11);

  }


}
