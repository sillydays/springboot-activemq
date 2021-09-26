package com.boot.demo.queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @Desc 消息队列 - 队列模式
 * @Author lixu
 * @Date 2021/9/24 17:04
 */
@Configuration
public class ActiveMqQueue {

    /**
     * 定义消息队列
     * @return 消息队列
     */
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("Queue1");
    }

    /**
     * 定义消息队列
     * @return 消息队列
     */
    @Bean
    public Queue queue2() {
        return new ActiveMQQueue("Queue2");
    }

}
