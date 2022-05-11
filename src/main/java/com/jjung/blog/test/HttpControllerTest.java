package com.jjung.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML 파일)
// @Controller

// 사용자가 요청 -> 응답(Data)
// @RestController

@RestController
public class HttpControllerTest {
	
	// http://localhost:8080/http/get
	// 인터넷 브라우저 요청은 get요청밖에 할 수 없다
	@GetMapping("/http/get")
	public String getTest(Member m) {
		
		return "get 요청 : " + m.getId() + ", " + m.getUsername();
	}
	
	// http://localhost:8080/http/post
	@PostMapping("/http/post")
	public String postTest() {
		
		return "post 요청";
	}
	
	// http://localhost:8080/http/put
	@PutMapping("/http/pu1t")
			
		public String putTest() {
		
		return "put 요청";
	}
	
	// http://localhost:8080/http/delete
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		
		return "delete 요청";
	}
	
}
