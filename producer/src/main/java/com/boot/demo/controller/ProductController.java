package com.boot.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * @Desc 消息队列 - 队列模式（P2P）
 * @Author lixu
 * @Date 2021/9/24 17:07
 */
@RestController
@Slf4j
public class ProductController {

    @Autowired
    private Queue queue;

    @Autowired
    private Queue queue2;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @GetMapping("/send")
    public void sendMsg(@RequestParam("msg") String msg) {
        log.info("----------------- 发消息哦 -----------------------------");
        jmsMessagingTemplate.convertAndSend(queue, msg);
        jmsMessagingTemplate.convertAndSend(queue2, msg);
        log.info("----------------- 发完了哦 -----------------------------");

        // 这种方式不需要手动创建queue，系统会自行创建名为test的队列
        // jmsMessagingTemplate.convertAndSend("test", name);
    }
}
