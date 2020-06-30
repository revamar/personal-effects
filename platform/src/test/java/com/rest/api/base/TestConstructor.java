package com.rest.api.base;

public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleConstructor s=new SimpleConstructor();
		System.out.println(s.getColor()+"<--color radius -->" + s.getRadious());
		System.out.println(s.toString());
		SimpleConstructor s1=new SimpleConstructor(90, "Yellow");
		System.out.println(s);
		System.out.println(s1.toString());
		System.out.println(s1);
		
//***************************************************************************
		SimpleConstructor2 sc2=new SimpleConstructor2();
		System.out.println(sc2);
//		SimpleConstructor3 sc31=new SimpleConstructor3();
	}

}
