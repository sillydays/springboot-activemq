package com.boot.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;

/**
 * @Desc
 * @Author lixu
 * @Date 2021/9/26 14:25
 */
@Configuration
@Slf4j
public class QueueTopicService {

    @JmsListener(destination = "Queue1", containerFactory = "queueListenerFactory")
    private void consumer1(String msg) {
        log.info("------------------------ 队列消费信息：{}", msg);
    }

    @JmsListener(destination = "topic", containerFactory = "topicListenerFactory")
    private void consumer2(String msg) {
        log.info("------------------------ 主题消费信息：{}", msg);
    }
}
