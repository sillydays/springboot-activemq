package com.boot.demo.queue;

import com.boot.demo.constant.Constant;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Topic;

/**
 * @Desc 消息队列 - 主题模式
 * @Author lixu
 * @Date 2021/9/26 11:25
 */
@Configuration
public class TopicQueue {

    @Bean
    public Topic topic() {
        return new ActiveMQTopic(Constant.TOPIC_NAME);
    }

}
