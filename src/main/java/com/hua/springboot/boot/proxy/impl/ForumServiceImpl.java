package com.hua.springboot.boot.proxy.impl;

import com.hua.springboot.boot.proxy.ForumService;

public class ForumServiceImpl implements ForumService {

  @Override
  public void removeTopic(int topicId) {
    System.out.println("模拟删除帖子记录:" + topicId);
    try {
      Thread.currentThread().sleep(20);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void removeForum(int forumId) {
    System.out.println("模拟删除论坛记录:" + forumId);

    try {
      Thread.currentThread().sleep(20);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
