package it.giocic.simplespringbootapp;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

/**
 * @author Giovanni Giordano<br>
 * See https://spring.io/guides/gs/spring-boot/
 * This class is the starting point of the Web application.
 */
@SpringBootApplication // This annotation makes this class a source of bean definitions for application context, enables some configurations based on classpath,
					   // enables component scanning on current package in order to find controllers.
public class SimpleSpringbootAppApplication {

	private static final String APPLICATION_NAME = "SimpleSpringBootApplication";

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootAppApplication.class, args); // This method launches a Spring application.
	}
	
	/**
	 * This method prints on standard output the list of beans loaded in application context after application was started.
	 * @param ctx - The Spring application context.
	 * @return a {@link CommandLineRunner} bean.
	 */
	@Bean
	@Order(value = 1)
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}
	
	@Bean
	@Order(value = 2)
	public CommandLineRunner startUpLogger() {
		return args -> {
			System.out.println(String.format("Application %s is ready!", APPLICATION_NAME));
		};
	}

}
