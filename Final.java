// final variable

/*
class Final{
    public static void main(String[] args){
        final int I=10;
        // i=i+20;
        System.out.println(I);
    }
}
*/

// final method

// final method kabhi ve override nahi ho sakta hai.

/*
class Demo{
    final void m1(){
        System.out.println("i am in class demo");
    }
}
class Final extends Demo{
    void m1(){
        System.out.println("i am in class final"); 
    }
    public static void main(String[] args){
        
    }
}
*/

// final class 
// jab me chata hu yous class ko koi inherit na kar sake.


final class Demo{
    
}
class Final extends Demo{
    public static void main(String[] args){
        
    }
}