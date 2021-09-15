package com.lti.client;

import com.lti.model.Flight;

public class Main {
	
	
	public static void main(String[] args) {
		
//		Flight f=new Flight(1002,"mumbai","pune");
//		Flight f1=new Flight(1005,"mumbai","pune");
//		System.out.println(f1.getFlightId());
//		System.out.println(f.getFlightId());
		//test data
		int num1=10;
		int num2=20;
		if(add(num1,num2)==30) {
			System.out.println("ok");
		}else {
			System.out.println("failed");
		}
		
	}
	
	
	public static int add(int n1,int n2) {
		
		return n1+n2;
	}
	
	
	public static boolean compare(int n1,int n2) {
		if(n1==n2) {
			return true;
		}
		else return false;
	}
	
	

}
