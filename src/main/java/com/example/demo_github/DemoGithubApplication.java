package com.example.demo_github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.spirngframework.web.bind.annotation.GetMapping;
import org.spirngframework.web.bind.annotationRestController;

@SpringBootApplication
public class DemoGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGithubApplication.class, args);
	}

}
@RestController
	class HelloWorldController {
		@Get Mapping("/")
		public string sayHello(){
			return "Hello, world !";
	}
}
