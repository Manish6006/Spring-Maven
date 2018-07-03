package com.classpath.spring.jconfig;

import org.springframework.stereotype.Component;

@Component("dominoz")
public class DominozPizzaDelivery implements PizzaDeliveryService{

	public Pizza deliverPizza() {
		
		return new Pizza("Dominos", 340.00);
	}

	
}
	

