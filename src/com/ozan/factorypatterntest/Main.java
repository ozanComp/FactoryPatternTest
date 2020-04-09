package com.ozan.factorypatterntest;

public class Main {
	public static void main(String[] args){
		try{
			Msi msi = (Msi) ComputerFactory.create(Msi.class);
			msi.name();
			msi.since(2015);
			
			Mac mac = (Mac) ComputerFactory.create(Mac.class);
			mac.name();
			mac.since(2016);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
