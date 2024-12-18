package com.collabera.library_managment_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class LibraryManagmentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagmentApiApplication.class, args);
	}

}
