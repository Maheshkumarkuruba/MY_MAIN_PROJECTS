package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.dao.UserRepository1;
import com.example.demo.entities.User;

@SpringBootApplication
@ComponentScan
public class JpaUtu1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaUtu1Application.class, args);
		UserRepository1 repository=context.getBean(UserRepository1.class);
		User user=new User();
		user.setCity("delhi");
		user.setName("mahes");
		user.setStatus("i am doing java");
		User user1=repository.save(user);
		System.out.println(user1);
	}

}
