
import java.util.Scanner;

class Main{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter String: ");
         String input = sc.next();
         
         char ch = 'a';
    
         for(int i=0;i<input.length();i++){
        
             if(input.charAt(i) != ch){
             System.out.print(input.charAt(i));    
         }
     }
    
    }
}