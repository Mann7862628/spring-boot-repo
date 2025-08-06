package com.gl.pro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

	@GetMapping("")
	public ResponseEntity<Object> getObject(){
		return ResponseEntity.ok().body("Hi");
	}
}
