package org.example.borrowing.service;

import org.example.borrowing.models.Borrowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class NotificationClient {

    @Value("${kafka.sms.topic}")
    private String topic;

    @Autowired
    private KafkaTemplate <String, Borrowing> kafkaTemplate;

    public void sendSMS(Borrowing borrowing){
        kafkaTemplate.send(topic,borrowing);
    }

}