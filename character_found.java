
public class Main
{

	public static void main(String[] args) {


	    
	    String str = "Umbrella";

	    
	    boolean  res = false;


	    
	    for(int i=0;i<str.length();i++)

	    	    {

	            	if(str.charAt(i) == 'e'){

	           	res = true;

	             	break;

	            	}

	    	    }


	    	    if(res == true)

	    	    {

	         	System.out.println("String contain 'e' Character.");

	            }
	
	    	    else{

	                System.out.println("Character 'e' not found!");
   
	    	    }

	}

}
