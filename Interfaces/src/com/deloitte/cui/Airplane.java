package com.deloitte.cui;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("taking off");

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("landing");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("flying");
			

	}

}
