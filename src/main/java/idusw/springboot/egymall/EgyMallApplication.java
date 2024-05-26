package idusw.springboot.egymall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication //(exclude={DataSourceAutoConfiguration.class})
@EnableJpaAuditing
// Spring - Annotation : java, lombok, spring
//@Configuration
//@EnableAutoConfiguration
public class EgyMallApplication {

	public static void main(String[] args) {
		SpringApplication.run(EgyMallApplication.class, args);
	}
	@Bean   //메소드를 호출하여 Bean 객체를 생성
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {    //put, delete 처리
		return new HiddenHttpMethodFilter();
	}
}
