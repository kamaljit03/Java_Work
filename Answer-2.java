public class Student{
    
    String name;
    int age;
   
    // Constructor with Two Parameters
    public Student(String name,int age){
    this.name = name;
    this.age = age;
    }
    
    public static void main(String[] args){

        // Initialize Variables Using Constructor
        Student st1 = new Student("Karan",10);

        System.out.println("Student Name: " + st1.name);
        System.out.println("Student Age: " + st1.age);
       
    }
}