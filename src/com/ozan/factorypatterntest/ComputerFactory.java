package com.ozan.factorypatterntest;

@SuppressWarnings("rawtypes")
public class ComputerFactory {
	public static Computer create(Class aclass) throws IllegalAccessException, InstantiationException{
		return (Computer) aclass.newInstance();
	}
}
