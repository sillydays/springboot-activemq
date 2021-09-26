package com.boot.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author lixu
 * @Date 2021/9/26 10:25
 */
@Component
@Slf4j
public class WeChatService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @JmsListener(destination = "Queue2")
    public void consumer(String msg) {
        log.info("--------------------------- Msg: {} 注册成功，微信消费", msg);
    }

}
