package cn.rectcircle.noticeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoticeServiceApplication {

	@Value("${spring.datasource.password}")
	private String msg;

	public static void main(String[] args) {
		SpringApplication.run(NoticeServiceApplication.class, args);
	}
}
