package cn.rectcircle.noticeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2018 rectcircle
 *
 * @author rectcircle
 * @date 2018-06-03
 * @version 0.0.1
 */
@RestController("/api")
public class MainController {

	@GetMapping
	public String hello() {
		return "Hello World";
	}
}