class Addition
{
    
    int res;
    
	public void add(int num1,int num2)
	{
	    res = num1+num2;
		System.out.println("Addition of Two Interger Values: " + res);
	}
	public void add(float num1,float num2)
	{
		float res = num1+num2;
		System.out.println("Addition of Two Float Values: " + res);
	}
	public void add(int num1,int num2,int num3)
	{
		res = num1+num2+num3;
	    System.out.println("Addition of Three Interger Values: " + res);
	}
}
class Main
{
	public static void main(String[] args){

		Addition a = new Addition();
		a.add(5,5); 	// Two integer parameters
		a.add(5.0f,5.0f); // Two floating parameters
		a.add(2,3,5);   // Three Integer parameters
	}
}