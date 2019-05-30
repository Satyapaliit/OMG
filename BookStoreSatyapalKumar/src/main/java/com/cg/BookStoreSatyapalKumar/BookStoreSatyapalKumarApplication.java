package com.cg.BookStoreSatyapalKumar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.cg.bookStore.beans")
public class BookStoreSatyapalKumarApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreSatyapalKumarApplication.class, args);
	}

}
