package ua.edu.ucu.apps.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flower.FlowerColor;

import java.util.List;

@SpringBootApplication
@RestController
public class FlowerStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerStoreApplication.class, args);
	}

	@GetMapping("/test")
	public String customTest(){
		return "That's test text.";
	}
}
