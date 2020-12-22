package org.eureka.client.article.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleController {
    @Autowired
    private RestTemplate restTemplate;

	/*
	 * @GetMapping("/article/callHello") public String callHello() { return
	 * restTemplate.getForObject("http://localhost:8081/user/hello", String.class);
	 * 
	 * }
	 */
    private Logger logger = LoggerFactory.getLogger(ArticleController.class);
	@GetMapping("/article/callHello2")
	public String callHello2() {
		logger.info("我是/article/callHello");
		return restTemplate.getForObject("http://eureka-client/user/hello", String.class);
	}
    

}