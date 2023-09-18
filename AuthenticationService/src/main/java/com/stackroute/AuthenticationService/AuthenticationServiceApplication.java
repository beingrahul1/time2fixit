package com.stackroute.AuthenticationService;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuthenticationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationServiceApplication.class, args);
	}

	public final static String queue="cgiqueue";
	public static String exchange="cgiexchange";
	public  static String routingKey="cgirk";
	
	public final static String otpqueue="otpqueue";
	public  static String otproutingKey="otprk";

	
	@Bean
	public org.springframework.amqp.core.Queue getQueue()
	{
		return new org.springframework.amqp.core.Queue(queue);
	}
	
	@Bean
	public org.springframework.amqp.core.Queue getQueue1()
	{
		return new org.springframework.amqp.core.Queue(otpqueue);
	}
	
	
	@Bean
	public TopicExchange getExchange()
	{
		return new TopicExchange(exchange);
	}
	
	@Bean
	public Binding bindQtoExchange(@Qualifier("getQueue") org.springframework.amqp.core.Queue queue,TopicExchange exchange)
	{
		return BindingBuilder.bind(queue).to(exchange).with(routingKey);
		
	}
	
	@Bean
	public Binding bindQtoExchange1(@Qualifier("getQueue1") org.springframework.amqp.core.Queue otpqueue,TopicExchange exchange)
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
