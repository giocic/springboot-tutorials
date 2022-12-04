package it.giocic.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {

	@Override
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot";
	}

}
