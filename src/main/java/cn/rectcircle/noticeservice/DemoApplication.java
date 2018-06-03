package cn.rectcircle.noticeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Value("${spring.datasource.password}")
	private String msg;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public String justATeset() {
		System.out.println("====================================================================================="+msg);
		return msg;
	}
}
