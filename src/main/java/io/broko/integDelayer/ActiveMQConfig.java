package io.broko.integDelayer;

import javax.annotation.PostConstruct;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.integration.config.EnableIntegration;

@Configuration
public class ActiveMQConfig {

	@Bean
    public Queue inQueue() {
        return new ActiveMQQueue("input.queue");
    }
    
    @Bean
    public Queue outQueue() {
        return new ActiveMQQueue("output.queue");
    }
	
}