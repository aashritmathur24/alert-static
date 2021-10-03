package com.aashrit.Weather.awsMessaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class WeatherAlertSNS {

    private final NotificationMessagingTemplate notificationMessagingTemplate;

    @Value("${weather.alert.topic}")
    private String topic_name;

    @Autowired
    public WeatherAlertSNS(NotificationMessagingTemplate notificationMessagingTemplate){
        this.notificationMessagingTemplate = notificationMessagingTemplate;
    }

    public void send(String subject, String message){
        this.notificationMessagingTemplate.sendNotification(topic_name, message, subject);
    }
}
