package com.jca;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jca.entity.Person;
import com.jca.jdbc.PersonDAO;

@SpringBootApplication
public class JpaUdemyApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PersonDAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaUdemyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All person {}",dao.findAll());
		logger.info("Person id 1 {}",dao.findById(1));
		logger.info("Deleting person  id 2 {}",dao.deleteById(2));
		logger.info("Insert person 4 {}",
				dao.insert(new Person(4,"Teresa","Sogamoso",new Date())));
		
		logger.info("Update person 3 {}",
				dao.update(new Person(3,"Pedro Angulo","Fresno",new Date())));
	}

}
