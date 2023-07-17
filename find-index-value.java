import java.util.*;

class Demo{

	int[] arr = {10,20,30,40,50};

	public void fetch()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Emter index number(0-4): ");
		
		try {
		    int input = sc.nextInt();
		    System.out.println("The value is: " + arr[input] + " present at index number " + input); 
		} 
		catch(ArrayIndexOutOfBoundsException e) {
		    System.out.println("Sorry Wrong Input! Input is Out of Range! ");
		}

	}
}
class Main
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.fetch(); //Method Calling
	}
}