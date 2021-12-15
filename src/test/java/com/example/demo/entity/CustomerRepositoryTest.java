package com.example.demo.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.example.demo.repository.CustomerRepository;

import io.zonky.test.db.AutoConfigureEmbeddedDatabase;


@RunWith(SpringRunner.class)
@AutoConfigureEmbeddedDatabase
@DataJpaTest
@ActiveProfiles("test")
public class CustomerRepositoryTest {

	
	@Autowired
	private CustomerRepository repository;

	
	@Test
	public void testSavePriceCustomer() {

		Customer object = new Customer();
		object.setCustomerId(Long.valueOf(3));
	    object.setCustomerName("Turik");
	    
	    
	    Customer savedRec = repository.save(object);
	    
	    System.out.println(savedRec.getCustomerName() + " saved!");

		Assert.notNull(savedRec, "Customer not saved!");
	}
}
