package pkg1.example.bootPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;;

@SpringBootApplication
public class BootPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(BootPracticeApplication.class, args);
		System.out.println("boot application started");
				
	}
}
