package com.example.kafka;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@EnableKafka

public class KafkaConsumer {

    @KafkaListener(topics = "MyTopic1", groupId = "testConsumerGroup")
   public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

}
