package com.ozan.factorypatterntest;

public class Mac implements Computer {

	@Override
	public void name() {
		System.out.println("The name of this computer is MAC");
	}

	@Override
	public void since(int year) {
		System.out.println("This computer was purchased in " + year);
	}
}
