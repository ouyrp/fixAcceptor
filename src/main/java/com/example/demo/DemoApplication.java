package com.example.demo;

import com.example.demo.acceptor.FixAcceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		try {
			FixAcceptor acceptor = new FixAcceptor();
			acceptor.init();
		}catch (Exception e){
			log.info("e:", e);
		}
	}

}
