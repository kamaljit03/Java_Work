class StaticMethod{
    
    // Static Method
    public static void disp(){
        System.out.println("I am a Static Method call without creating an object of class.");
    }
}

class Main{
    public static void main(String[] args){
        
        StaticMethod.disp(); // Static Method Calling
    }
}