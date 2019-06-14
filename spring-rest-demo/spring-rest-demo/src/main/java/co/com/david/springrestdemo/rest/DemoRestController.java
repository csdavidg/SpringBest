package co.com.david.springrestdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoRest")
public class DemoRestController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}

}
