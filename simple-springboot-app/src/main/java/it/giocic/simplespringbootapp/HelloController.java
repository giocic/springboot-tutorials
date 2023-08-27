package it.giocic.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController = @Controller + @ResponseBody
/**
 * @author Giovanni Giordano
 * This is a simple REST Controller. See https://spring.io/guides/gs/spring-boot/
 *
 */
@RestController // This annotations means that this controller can handle Web requests. Methods of this controller will return pure data instead of a view.
public class HelloController {

	@GetMapping("/") // With this annotation we declare that requests towards path "/" must be handled by method index()
	public String index() {
		return "Greetings from Spring Boot";
	}

}
