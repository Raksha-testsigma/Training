package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topoic> getAllTopics() {
			return Arrays.asList(
					new Topoic("spring","taylor","swift"),
					new Topoic("js","frontend","Backend"),
					new Topoic("Testsigma","Testing","Hello")
					);
	}

}
