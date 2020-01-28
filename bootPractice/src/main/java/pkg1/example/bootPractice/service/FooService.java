package pkg1.example.bootPractice.service;

import org.springframework.stereotype.Service;

@Service
public class FooService {

	public void serve() {
		System.out.println("service method called");
		throw new IllegalArgumentException();
	}
}
