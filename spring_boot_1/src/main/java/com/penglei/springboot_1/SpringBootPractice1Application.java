package com.penglei.springboot_1;

import com.penglei.springboot_1.model.AuthorSettings;
import com.penglei.springboot_1.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class SpringBootPractice1Application {

    @Autowired
	AuthorSettings authorSettings;


	@RequestMapping("/index")
	public String index(Model model) {
		Person single = new Person("kevin", 28);

		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("xx", 11);
		Person p2 = new Person("yy", 22);
		Person p3 = new Person("zz", 33);
		people.add(p1);
		people.add(p2);
		people.add(p3);

		model.addAttribute("singlePerson", single);
		model.addAttribute("people", people);
		return "index";
	}



	@RequestMapping(value = "/")
	String index(){
		return authorSettings.getName()+"*****"+authorSettings.getPassword()+"****"+authorSettings.getAge();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootPractice1Application.class, args);
	}
}
