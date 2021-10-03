package com.aashrit.WeatherConsumer;

import com.aashrit.WeatherConsumer.aws.WeatherAlertsListenerSQS;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WeatherConsumerApplication {

	public static void main(String[] args) throws JsonProcessingException {
		ApplicationContext applicationContext = SpringApplication.run(WeatherConsumerApplication.class, args);
		WeatherAlertsListenerSQS weatherAlertsListenerSQS = applicationContext.getBean(WeatherAlertsListenerSQS.class);
		weatherAlertsListenerSQS.startListeningToMessages();
	}
}
