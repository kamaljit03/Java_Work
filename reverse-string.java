import java.util.Scanner;



class Main{

    public static void main(String[] args){


        
System.out.print("Enter Your String: ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();


        
        for(int i=str.length()-1;i>=0;i--){

            
            System.out.print(str.charAt(i));

        }

    }

}