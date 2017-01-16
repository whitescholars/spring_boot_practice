package com.penglei.springboot_1;

import com.penglei.springboot_1.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootPractice1Application {

	@Autowired
	private AuthorSettings authorSettings;

	@RequestMapping(value = "/")
	String index(){
		return authorSettings.getName()+"*****"+authorSettings.getPassword()+"****"+authorSettings.getAge();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootPractice1Application.class, args);
	}
}
