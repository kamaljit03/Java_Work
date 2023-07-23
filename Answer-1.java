class Demo{
    
    // Static Counter Filed
    static int counter = 0;
    
    public Demo(){
        counter++;;
    }
    
    public static int getCounter(){
        return counter;
    }
    
    public static void main(String[] args){
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        Demo d4 = new Demo();
        
        System.out.println("Number of instances or objects created are: " + Demo.getCounter());
    }
}