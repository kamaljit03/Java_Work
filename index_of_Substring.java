class Main{
    public static void main(String[] args){
        
        String str = "Java is a Programming Language";
        int index = str.indexOf("Programming");
        
        if(index == -1){
            System.out.println("String Not Found!");
        }
        else{
            System.out.println("String at index: " + index);
        }
    }
}