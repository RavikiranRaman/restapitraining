package io.java.spring.controller.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topiccontrolesr {
	
	@Autowired
	private TopicService topicservice;
	
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics() {
		return topicservice.getAllTopics();	
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getSelectedTopic(@PathVariable String id) {
		return topicservice.getSelectedTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topic" )
	public void addtopic(@RequestBody Topic requestbody) {
		topicservice.addtopic(requestbody);
	}
	
	

}
