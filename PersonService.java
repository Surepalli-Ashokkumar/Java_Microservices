package com.cisco.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cisco.demo.entity.PersonEntity;
import com.cisco.demo.repo.PersonRepo;

@Service
public class PersonService 
{
    @Autowired
	private PersonRepo repo;
    
    private RestTemplate restTemplate = new RestTemplate();
    
    public PersonEntity addPerson(PersonEntity person)
    {
    	return repo.save(person);
    }
    
    
    
}
