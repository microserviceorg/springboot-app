package com.durgadas.springboot.topic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{
	// No need to provide implementation.. just follow the naming convention and spring jpa will add the implementation for you.  findBy<PropertyName>
	public List<Topic> findByName(String name);
	public List<Topic> findByDescription(String description);

}
