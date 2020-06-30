package com.rest.api.tests.users;

public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] int_arr={10, 5, 9, 89, 44, 98};
		int[] rev = new int[int_arr.length];

		for (int i = 0; i < int_arr.length; i++) {
			rev[int_arr.length - 1 - i] = int_arr[i];
		}

		for (int i = 0; i < int_arr.length; i++) {
			int_arr[i] = rev[i];
			System.out.print(int_arr[i]+"  ");
		}
	}

}
