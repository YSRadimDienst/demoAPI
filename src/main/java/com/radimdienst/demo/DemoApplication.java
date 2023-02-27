package com.radimdienst.demo;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
@RestController()
public class DemoApplication {

	@GetMapping()
	String get()	{
		return "test Erfolgreich!!";
	}


	public static void main(String[] args) throws IOException {


		SpringApplication.run(DemoApplication.class, args);
	}

}
