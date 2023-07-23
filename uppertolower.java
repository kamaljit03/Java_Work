import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Yout String: ");
        String str1 = sc.nextLine();
        
        String str2 = str1.toUpperCase();
       
        if(str1 == str2){
            System.out.println("Lowercase is: " + str1.toLowerCase());
        }
        else{
            System.out.println("Uppercase is: " + str2);
        }
       
        
    }
}