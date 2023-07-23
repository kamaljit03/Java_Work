class Student{
    
    // Instance Fields
    private String name;
    private int age;
    
    // Constructor with Two Parameters
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public void getName(){
        System.out.println("Student Name: " + name);
    }
    public void getAge(){
        System.out.println("Student Age: " + age);
    }
    
    public static void main(String[] args){
        
        Student st = new Student("Rahul",20);
        st.getName();
        st.getAge();
    }
}