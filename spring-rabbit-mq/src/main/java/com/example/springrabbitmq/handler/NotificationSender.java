package com.example.springrabbitmq.handler;

import com.example.springrabbitmq.model.Notification;
import com.example.springrabbitmq.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@Component
public class NotificationSender {

    @Autowired
    private NotificationProducer producer;

    public void getThread() {
        Thread thread = new Thread(() -> {
            while (true) {
                Notification notification = new Notification();
                notification.setNotificationId(new Random().nextInt(100)+1);
                notification.setCreatedAt(null);
                notification.setMessage("Haydi kodlayalımdan mesaj var...");
                notification.setSeen(false);
                producer.sendToQueue(notification);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setName("Notification sender");
        thread.start();
    }


    @PostConstruct
    public void init() {
        getThread();

    }


}
