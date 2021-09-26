package com.boot.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @Desc
 * @Author lixu
 * @Date 2021/9/26 13:29
 */
@RestController
@Slf4j
public class TwoPatternController {


    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @GetMapping("/two/send")
    public void sendMsg(@RequestParam("msg") String msg) {
        log.info("----------------- 发消息哦 -----------------------------");
        jmsMessagingTemplate.convertAndSend(queue, msg);
        jmsMessagingTemplate.convertAndSend(topic, msg);
        log.info("----------------- 发完了哦 -----------------------------");
    }


}
