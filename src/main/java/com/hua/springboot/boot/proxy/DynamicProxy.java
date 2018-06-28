package com.hua.springboot.boot.proxy;

import com.hua.springboot.boot.proxy.impl.ForumServiceImpl;
import java.lang.reflect.Proxy;

public class DynamicProxy {


  public static void main(String[] args) {
    ForumService forumService = new ForumServiceImpl();

    ProxyHandler proxyHandler = new ProxyHandler(forumService);

    ForumService  o = (ForumService) Proxy.newProxyInstance(forumService.getClass().getClassLoader(),
        forumService.getClass().getInterfaces(), proxyHandler);


    o.removeForum(11);
    o.removeTopic(11);

  }


}
