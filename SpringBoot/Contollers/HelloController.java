package io.javatsts.springbootstarter.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController() {
	@RequestMapping("/hello")
	public String main(){
		return "Hi"; 
	}
}
