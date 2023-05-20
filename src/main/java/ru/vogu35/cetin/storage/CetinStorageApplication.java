package ru.vogu35.cetin.storage;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class CetinStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CetinStorageApplication.class, args);
		log.info("HE-HE");
	}
}
