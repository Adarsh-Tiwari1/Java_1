// static variable

// class level variable he static variable hote hai
// local variable static nahi hote hai.


// e1, e2 : store in stack memory
// empid, name, company : heap memory

/*
class Static{
    int empid;
    String name;
    String company;

    Static(int empid, String name, String company){
        this.empid=empid;
        this.name=name;
        this.company=company;
    }
    void display(){
        System.out.println(empid+" "+name+" "+company);
    }
    public static void main(String[] args){
        Static e = new Static(101, "adarsh", "rewa");
        e.display();
        Static e2 = new Static(201, "tiwari", "sonauri");
        e2.display();
    }
}
*/


// e1, e2 : stack memory
// empid, name : heap memory
// company : class or method area

// the static variable can be used to refer to the common property or value for all objects.

// the static variable gets memory only once in the class area at the time of class loading.
/*
class Static{
    int empid;
    String name;
    static String company="rewa";

    Static(int empid, String name){
        this.empid=empid;
        this.name=name;
    }
    void display(){
        System.out.println(empid+" "+name+" "+company);
    }
    public static void main(String[] args){
        Static e = new Static(101, "adarsh");
        e.display();
        Static e2 = new Static(201, "tiwari");
        e2.display();
    }
}
*/

//  Static Method : static methods belongs to class, not object 
// static method can be called directly by class nameas follows : className.methodName();

/*
class Static{
    static void display(){
        System.out.println("a");
    }
    public static void main(String[] args){
        display();
    }
}
*/


/*
class Static{
    static void display(){
        System.out.println("a");
    }
    public static void main(String[] args){
        display();
        x.show();
    }
}
class x{
    static void show(){
        System.out.println("b");
    }
}
*/


// a static method can access only static data. it can not access non static data . ex. instance data

/*
class Static{
    static int i=10;
    static void display(){
        System.out.println("a");
    }
}
*/

// static method can call only other static method and can not call a non static method.

/*
class Static{
    
    static void display(){
        show();
        System.out.println("a");
    }
    static void show(){
        System.out.println("b");
    }
}
*/


// a static method can not refer to "this" or "super" keyword in anyway.

/*
class Static{
    int i=10;
    static void display(){       
        System.out.println(this.i);
    }
}
*/

/*
class Static{
    int i=10;
    void display(){       
        System.out.println(this.i);
    }
}
*/




// Static Block 

// static block execute automatically when the class is loaded in the memory..

class Static{
    static {
        System.out.println("Hello");
    }
    static{
        System.out.println("I am second static block");
    }
    public static void main(String[] args){
        System.out.println("I am main method");
    }
}

