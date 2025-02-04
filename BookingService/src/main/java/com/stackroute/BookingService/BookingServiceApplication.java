package com.stackroute.BookingService;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookingServiceApplication {
//Main Application
	public static void main(String[] args) {
		SpringApplication.run(BookingServiceApplication.class, args);
	}
	public final static String queue="cgiqueue";
	public static String exchange="cgiexchange";
	public  static String routingKey="cgirk";

	
	@Bean
	public Queue getQueue()
	{
		return new Queue(queue);
	}
	
	
	@Bean
	public TopicExchange getExchange()
	{
		return new TopicExchange(exchange);
	}
	
	@Bean
	public Binding bindQtoExchange(Queue queue,TopicExchange exchange)
	{
		return BindingBuilder.bind(queue).to(exchange).with(routingKey);
		
	}
	
	
	@Bean
	public MessageConverter getConverter()
	{
		return new Jackson2JsonMessageConverter();
	}
	
	
	@Bean 
	public RabbitTemplate getTemplate(ConnectionFactory connectionFactory)
	{
		//RabbitTemplate
		RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory);
		
		rabbitTemplate.setMessageConverter(getConverter());
	
		return rabbitTemplate;
	}
	
}

