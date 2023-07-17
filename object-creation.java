class Demo
{
	public void disp()
	{
		System.out.println("I am a display method called by Main method..");
	}
}
class Main
{
	public static void main(String[] args){

		Demo d = new Demo();
		d.disp(); // Method Calling
	}
}