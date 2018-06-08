package io.javabrains.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Tejas!!!";
	}
	
	@RequestMapping("/add")
	public int getAdd() {
		int c,a=10,b=20;
		return c = a+b;
	}

}
