class Arrays
{
	int[] ar = {100,200,300,400,500};

	public void result()
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("The value of: " + ar[i]);
		}
	}
}
class Main
{
	public static void main(String[] args){

		Arrays a = new Arrays();
		a.result();  // Method Calling
	}
}