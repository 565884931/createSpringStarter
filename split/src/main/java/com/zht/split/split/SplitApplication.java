package com.zht.split.split;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportAutoConfiguration({StarterAutoConfigure.class})
public class SplitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitApplication.class, args);
	}
}
