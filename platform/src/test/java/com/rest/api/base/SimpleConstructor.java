package com.rest.api.base;

public class SimpleConstructor {

	private int radius=10;
	private String color="Yellow";
	
	 SimpleConstructor() {
		// TODO Auto-generated constructor stub
		radius=15;
		color="Red";
	}
	
	public SimpleConstructor(int radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public int getRadious()
	{
		return radius;
	}
	
	public String getColor()
	{
		return color;
	}
	
	final public void area(String s, int age)
	{
		
	}
	
	final public void area(int age, String s)
	{
		
	}
	
	public String toString() {
		   return "Circle[radius=" + radius + ",color=" + color + "]";
		}
}
