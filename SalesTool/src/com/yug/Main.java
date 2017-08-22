package com.yug;

public class Main {

	public static void main(String[] args) {
		
		SalesData data = new SalesData();
		displayGreeting();
		data.display();

	}

	private static void displayGreeting(){
		System.out.println("HELLO Welcome to Hybris Sales");		
	}
}
