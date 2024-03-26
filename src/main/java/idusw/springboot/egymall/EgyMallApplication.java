package idusw.springboot.egymall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication // Spring - Annotation : java, lombok, spring
//@Configuration
//@EnableAutoConfiguration
public class EgyMallApplication {

	public static void main(String[] args) {
		SpringApplication.run(EgyMallApplication.class, args);
	}

}
