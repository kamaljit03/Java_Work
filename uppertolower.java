import java.util.Scanner;
class Operation{
    
    public void upper(String s){
        System.out.println("Uppercase is: " + s.toUpperCase());
    }
    public void lower(String s){
        System.out.println("Lowercase is: " + s.toLowerCase());
    }
}

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Yout String: ");
        String str = sc.nextLine();
        
        Operation op = new Operation();
        op.upper(str);
        op.lower(str);
        
    }
}