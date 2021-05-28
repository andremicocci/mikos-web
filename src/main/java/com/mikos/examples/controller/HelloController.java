package com.mikos.examples.controller;

import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mikos.examples.model.Hello;

@RestController
public class HelloController {

	@GetMapping("/v1/hello/{delay}")
	public Hello hello(@PathVariable(required = true) Optional<Integer> delay, HttpServletRequest request)
			throws InterruptedException {
		Integer delayy = new Integer("1");
		if (delay.isPresent()) {
			delayy = delay.get();
		}
		delayy = delayy * 1000;

		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null) {
			ipAddress = request.getRemoteAddr();
		}

		Thread.sleep(delayy);
		return new Hello(UUID.randomUUID(), ipAddress, "Timeout setado : " + delayy + " milisegundo(s).");
	}
}