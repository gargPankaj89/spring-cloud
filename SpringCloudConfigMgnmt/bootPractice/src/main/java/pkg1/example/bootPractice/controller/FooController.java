package pkg1.example.bootPractice.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("foo")
@RequestMapping("/foo")
public class FooController {	
	
	@Value("${isConfFlag}")
	private String flag;	
	
	@Value("${custom.property}")
	private String property;
	
	
	
	@RequestMapping("/callFoo")
	public void callFoo() throws IOException{
		System.out.println("property is "+property);
	}
}

