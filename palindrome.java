
import java.util.Scanner;

class Main{
     public static void main(String[] args) {
         
        String rev = "";
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();
         
        int len = input.length();
        for(int i=len-1;i>=0;i--){
            rev = rev + input.charAt(i);
        }     
             
        if(input.equals(rev)){
            System.out.println("String is Palindrome."); 
        }
        else{
            System.out.println("String is not Palindrome!"); 
        }
     }
}