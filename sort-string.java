import java.util.Arrays;

public class Main {

	public static String sortString(String input)
	{
	
		char tempArray[] = input.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}


	public static void main(String[] args)
	{
	
		String input = "Java Programming";
		String outputString = sortString(input);

		System.out.println("Input String : " + input);
		System.out.println("Output String : "
						+ outputString);
	}
}
