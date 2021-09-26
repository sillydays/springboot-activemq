package com.boot.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * @Desc 消息队列 - 主题消费
 * @Author lixu
 * @Date 2021/9/26 11:41
 */
@Component
@Slf4j
public class TopicService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @JmsListener(destination = Constant.TOPIC_NAME)
    private void consumerTopic(String msg) {
        log.info("============================ Consumer 1 消费主题信息：{}", msg);
    }

    @JmsListener(destination = Constant.TOPIC_NAME)
    private void consumerTopic2(String msg) {
        log.info("============================ Consumer 2 消费主题信息：{}", msg);
    }


}
