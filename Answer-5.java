public class Demo{
    
    String name;
    int age;
    
    // Static Block
    static{
        System.out.println("Static Block Executed..");
    }
    
    // Default Constructor
    public Demo(){
        System.out.println("Default Constructor.");    
    }
   
    // One String Parameter Constructor 
    public Demo(String name){
        this.name = name;
        System.out.println(name);
    }
    
    // One Integer Parameter Constructor 
    public Demo(int age){
        super();
        this.age = age;
        System.out.println(age);
    }
    
    // Two Parameter Constructor 
    public Demo(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
    
    public static void main(String[] args){
        
        // Initialize Values Using Constructos
        Demo d1 = new Demo(10);
        Demo d2 = new Demo("Karan");
        Demo d3 = new Demo("Karan",10);
       
    }
}