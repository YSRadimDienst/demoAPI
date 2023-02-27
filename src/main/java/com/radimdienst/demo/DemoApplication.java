package com.radimdienst.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController()
public class DemoApplication {

	@GetMapping()
	String get()	{
		return "test Erfolgreich!!";
	}


	public static void main(String[] args)  {


		SpringApplication.run(DemoApplication.class, args);
	}

}
