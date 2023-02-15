package io.shyam.spring.basics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);


		//RecommenderImplementation injects dependency using constructor
		System.out.println("Calling getBean() on RecommenderImplementation");
		RecommenderImplementation2 recommender= applicationContext.getBean(RecommenderImplementation2.class);
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
	}

}
