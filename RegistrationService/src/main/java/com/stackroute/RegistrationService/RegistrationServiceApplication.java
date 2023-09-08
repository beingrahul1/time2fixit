package com.stackroute.RegistrationService;



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
public class RegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationServiceApplication.class, args);
	}


	public final static String queue="cgiqueue";
	public final static String queue1="cgiqueue1";
	public final static String queue2="cgiqueue2";
	public static String exchange="cgiexchange";
	public  static String routingKey="cgirk";
	public  static String routingKey1="cgirk1";
	public  static String routingKey2="cgirk2";

	
	@Bean
	public org.springframework.amqp.core.Queue getQueue()
	{
		return new org.springframework.amqp.core.Queue(queue);
	}
	
	@Bean
	public org.springframework.amqp.core.Queue getQueue1()
	{
		return new org.springframework.amqp.core.Queue(queue1);
	}
	
	@Bean
	public org.springframework.amqp.core.Queue getQueue2()
	{
		return new org.springframework.amqp.core.Queue(queue2);
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
		//return BindingBuilder.bind(queue1).to(exchange).with(routingKey1);
		
	}
	
	@Bean
	public Binding bindQtoExchange1(@Qualifier("getQueue1") org.springframework.amqp.core.Queue queue1,TopicExchange exchange)
	{
		return BindingBuilder.bind(queue1).to(exchange).with(routingKey1);
		
	}
	
	@Bean
	public Binding bindQtoExchange2(@Qualifier("getQueue2") org.springframework.amqp.core.Queue queue2,TopicExchange exchange)
	{
		return BindingBuilder.bind(queue2).to(exchange).with(routingKey2);
		
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
