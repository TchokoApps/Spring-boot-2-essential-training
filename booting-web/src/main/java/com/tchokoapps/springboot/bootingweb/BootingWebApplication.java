package com.tchokoapps.springboot.bootingweb;

import com.tchokoapps.springboot.bootingweb.models.Room;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Slf4j
@SpringBootApplication
public class BootingWebApplication {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            log.info("Starting  CLR application");
			ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8000/api/v1/rooms",
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
					});
			Objects.requireNonNull(rooms.getBody()).forEach(room -> {
				log.info(room.toString());
			});
			log.info("Finishing  CLR application");
		};
    }

    public static void main(String[] args) {
        SpringApplication.run(BootingWebApplication.class, args);
    }

}
