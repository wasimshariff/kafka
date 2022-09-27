package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.IntStream;

@SpringBootApplication
public class KafkaApplication {

	@Autowired
	private KafkaSender sender;

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner CommandLineRunnerBean() {
		return (args) -> {
			System.out.println("In CommandLineRunnerImpl ");
			IntStream.range(0,100).forEach( index ->
			sender.sendMessage("hello Wasim ".concat(String.valueOf(index)), "MyTopic1")
			);
		};
	}*/

}
