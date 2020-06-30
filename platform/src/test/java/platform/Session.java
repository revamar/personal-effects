package platform;

public class Session {
	public static void findSecondLargestNumber()
	{
		int arr[] = { 19, 46, 49, 88, 99 };
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} 
			else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
	
	public static int findnumberUsingSort()
	{
		int[] numbers= {44,3,43,65,7,90,1,54};
		int sz=numbers.length;
		if (sz==0||sz==1) {
			System.out.println("Array is too short. Please provide greater than 2 size array");
		}
		
		for(int i=0;i<sz;i++) {
			int temp;
			for(int j=i+1;j<sz;j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
			
		}
		
		for(int i=0;i<sz;i++)
		{
			System.out.println(numbers[i]);
		}
		return numbers[sz-2];
	}
	public static void alternateForDuplicateWord()
	{
		 String string = "Big black big bug bit a big black dog on his big black nose guru guru guru guru guru";  
	        int count;  
	          
	        //Converts the string into lowercase  
	        string = string.toLowerCase();  
	          
	        //Split the string into words using built-in function  
	        String words[] = string.split(" ");  
	          
	        System.out.println("Duplicate words in a given string : ");   
	        for(int i = 0; i < words.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j < words.length; j++) {  
	                if(words[i].equals(words[j])) {  
	                    count++;
	                    words[j] = "0";  
	                }  
	            }  
	            
	            if(count > 1 && words[i] != "0")  
	            {
	            	System.out.println(words[i]);  
	            	System.out.println(count);
	            }
	        }  
	}
	public static void main(String[] args) {
		alternateForDuplicateWord();
	}

}
