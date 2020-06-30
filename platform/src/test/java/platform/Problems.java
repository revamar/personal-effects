package platform;

public class Problems {

	public void printIntegerArray() {
	}
	
	public static int returnIntegerOfYourChoice()
	{
		try {
			System.out.println("try block");
			throw new RuntimeException();

		}catch(Exception e)
		{
			System.out.println("catch");
			System.exit(0);
			return 2;
		}
		finally {
			System.out.println("Finally block");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("banana".compareTo("apple"));
		System.out.println(returnIntegerOfYourChoice());
		System.out.println("apple".equals("apple"));
	}

}
