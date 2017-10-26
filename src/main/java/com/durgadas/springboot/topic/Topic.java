package com.durgadas.springboot.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Topic {
	@Id
	@ApiModelProperty(value="Id of the topic",required = true)
	private String id;
	@ApiModelProperty(value="Name:what you wanna call it")
	private String name;
	@ApiModelProperty(value="Some description about the topic")
	private String description;
	
	public Topic() {
	}
	

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
