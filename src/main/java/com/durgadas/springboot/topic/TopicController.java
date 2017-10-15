package com.durgadas.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {
	
	@Autowired
	TopicService topicService;

	@GetMapping
	public List<Topic> getAllTopics(@RequestParam (name="name",required=false) String name){
		if (null != name) {
			return topicService.getTopicsByName(name);
		}
		return topicService.getAllTopics();
		
	}
	
	@GetMapping("/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
