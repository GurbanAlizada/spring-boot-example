package com.example.springrabbitmq.lintener;

import com.example.springrabbitmq.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
public class NotificationListener {



    @RabbitListener(queues = "haydi-kodlayalim-queue")
    public void handleMessage(Notification notification){
        System.out.println(notification.toString());
    }




}
