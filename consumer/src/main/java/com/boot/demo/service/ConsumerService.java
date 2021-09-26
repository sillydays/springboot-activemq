package com.boot.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author lixu
 * @Date 2021/9/24 17:29
 */
@Component
@Slf4j
public class ConsumerService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @JmsListener(destination = "Queue1")
    public void consumer1(String msg) {
        log.info("--------------------------- Msg: {} 注册成功，手机短信消费", msg);
    }
}
