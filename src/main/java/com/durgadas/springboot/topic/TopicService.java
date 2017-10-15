package com.durgadas.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("1", "Java", "Java OO Concepts"),
			new Topic("2", "Angular", "Getting Started with Angular")));
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id , Topic topic) {
		topics = topics.stream().map(t -> { return t.getId().equals(id) == true ? topic : t ;}).collect(Collectors.toList());
	}

}
