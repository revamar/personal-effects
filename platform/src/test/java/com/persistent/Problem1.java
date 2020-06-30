package com.persistent;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

	public static void stringNumbersSeparationFromList(List<String> input)
	{
		int stringCount=0;
		int digitCount=0;
		
		if(input.isEmpty())
		{
			System.out.println("Current list is empty. Provide your entries here");
		}
		
		for(String string:input) {
			if(string.matches("\\S+") && (string.split(" ").length>=2))
			{
				input.remove(string);
			}
		}
		for(String string:input) {
				if(string.matches("[0-9]+"))
				{
					digitCount++;
				}
				else if (string.matches("[a-zA-Z]+")) {
					stringCount++;
				}
		}
		System.out.println("Strings count that contain alphabets only: "+stringCount);
		System.out.println("Strings count that contains numeric only: "+ digitCount);
	}
	public static void main(String[] args) {
		List<String> input=new LinkedList<>();
		input.add("Hello");
		input.add("persistent");
		input.add("9847");
		input.add("company");
		input.add("2121");
		input.add("8077");
		input.add("9887");
		input.add("5555");
		stringNumbersSeparationFromList(input);
	}

}
