package com.jjung.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML 파일)
// @Controller

// 사용자가 요청 -> 응답(Data)
// @RestController

@RestController
public class HttpControllerTest {
	
	private static final String TAG = "HttpControllerTEst : ";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = Member.builder().username("ssar").password("1234").build();
		//Member m = new Member(1,"admin","1234","asda.naver.com");
		System.out.println(TAG + "getter : " + m.getId());
		m.setId(5000);
		System.out.println(TAG + "setter : " + m.getId());
		return "lombok test 완료";
		
	}
	
	// http://localhost:8080/http/get
	// 인터넷 브라우저 요청은 get요청밖에 할 수 없다
	@GetMapping("/http/get")
	public String getTest(Member m) {
		
		return "get 요청 : " + m.getId() + ", " + m.getUsername();
	}
	
	// http://localhost:8080/http/post
	@PostMapping("/http/post") // text/plain , application/json
	public String postTest(@RequestBody Member m) { // MessageConverter (스프링부트)
		
		return "post 요청 : " + m.getId() + ", " + m.getUsername();
	}
	
	// http://localhost:8080/http/put
	@PutMapping("/http/put")
			
		public String putTest(@RequestBody Member m) {
		
		return "put 요청";
	}
	
	// http://localhost:8080/http/delete
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		
		return "delete 요청";
	}
	
}
