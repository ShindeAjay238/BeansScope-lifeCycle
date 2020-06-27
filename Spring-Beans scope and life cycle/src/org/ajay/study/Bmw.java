package org.ajay.study;

public class Bmw implements Car {

	@Override
	public String run() {
		
		return "Car is Running";
	}

	@Override
	public String stop() {
		
		return "Car was stoped";
	}

	public void doInitMethod() {
		
		System.out.println("Do bean Init in method inside");
	}
	
	public void doDestroyMethod() {
		System.out.println("Do bean destroy method inside");
	}
	
}
