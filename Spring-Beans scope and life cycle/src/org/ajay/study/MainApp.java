package org.ajay.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		Car theCar=context.getBean("myCar",Car.class);
		
		System.out.println(theCar.run());
		
		//close the context
		context.close();
		
		
	
	}
}
