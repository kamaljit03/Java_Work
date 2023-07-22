import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        int j=0;
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        char ch[] = new char[20];
        
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == 'a' || input.charAt(i) == 'A' || input.charAt(i) == 'e' || input.charAt(i) == 'E' || input.charAt(i) == 'i' || input.charAt(i) == 'I' || input.charAt(i) == 'o' || input.charAt(i) == 'O'  || input.charAt(i) == 'u' || input.charAt(i) == 'U' ){
                
                ch[j++] = input.charAt(i);
            }
            else{
                continue;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}