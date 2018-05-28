package io.broko.integDelayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
@ImportResource(locations = { "classpath:Delayer.xml"})
public class IntegDelayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegDelayerApplication.class, args);
	}
}
