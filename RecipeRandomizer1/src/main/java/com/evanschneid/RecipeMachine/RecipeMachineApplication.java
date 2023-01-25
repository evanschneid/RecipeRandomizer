package com.evanschneid.RecipeMachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeMachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeMachineApplication.class, args);
	}


	// Questions:
	// 1. How to combine tables and send that info to postman (see JdbcRecipeDao for an example with Recipe Details)
	// 2. Should I build out Dao's and Jdbc's for all the models? Even if there are no plans to search for specific ingredients/ Measurements/ Steps
	// 3. How to get the Random Number working, so I can implement that in a call
}
