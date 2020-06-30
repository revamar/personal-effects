package com.persistent;

public class Problem2 {

	public static int getThirdLargestNumberFromTheIntarray(int[] input)
	{
		if(input.length<=2)
		{
			System.out.println("Integer size is too short to process. Take the integeres of correct size which is >=3");
			System.exit(0);
		}
		
		for(int i=0;i<input.length;i++) {
			int temp;
			for(int j=i+1;j<input.length;j++) {
				if(input[i]>input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		return input[input.length-3];
	}
	public static void main(String[] args) {
		int[] integers= {8,3,56,5,7,8,11,9,40,37,34};
		int thirdLargest=getThirdLargestNumberFromTheIntarray(integers);
		System.out.println("Third Largest Num is: "+thirdLargest);
	}

}
