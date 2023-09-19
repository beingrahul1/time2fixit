package com.stackroute.NotificationService;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}
	
	public static String exchange="cgiexchange";
	public final static String otpqueue="otpqueue";
	public  static String otproutingKey="otprk";
	
	@Bean
	public org.springframework.amqp.core.Queue getQueue()
	{
		return new org.springframework.amqp.core.Queue(otpqueue);
	}
	
	@Bean
	public TopicExchange getExchange()
	{
		return new TopicExchange(exchange);
	}
	
	@Bean
	public Binding bindQtoExchange(org.springframework.amqp.core.Queue otpqueue,TopicExchange exchange)
	{
		return BindingBuilder.bind(otpqueue).to(exchange).with(otproutingKey);
		
	}
	
	@Bean
	public MessageConverter getConverter()
	{
		return new Jackson2JsonMessageConverter();
	}
	
	
	@Bean 
	public RabbitTemplate getTemplate(ConnectionFactory connectionFactory)
	{
		
		RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory);
		
		rabbitTemplate.setMessageConverter(getConverter());
	
		return rabbitTemplate;
	}
	

}
