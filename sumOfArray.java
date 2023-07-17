class Arrays
{
	int res = 0;
	int[] arr = {100,200,300,400,500};

	public void disp()
	{
		for(int i=0;i<arr.length;i++){

			res = res + arr[i];
		}
		System.out.println("Sum of all Elements in Array: " + res);
	}

}
class Main
{
	public static void main(String[] args){

		Arrays a = new Arrays();
		a.disp(); // Method Calling
	}
}