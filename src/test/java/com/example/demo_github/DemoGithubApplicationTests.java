package com.example.demo_github;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.spirngframework.web.bind.annotation.GetMapping;
import org.spirngframework.web.bind.annotationRestController;

@SpringBootTest
class DemoGithubApplicationTests {

	@Test
	void contextLoads() {
	}

}

@RestController
	class HelloWorldController {
		@Get Mapping("/")
		public string sayHello(){
			return "Hello, world !";
	}
}
