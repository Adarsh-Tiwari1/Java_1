/*
class ConstDurga{
    String name;
    int age;
    ConstDurga(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args){
        ConstDurga c1 = new ConstDurga();
        ConstDurga c2 = new ConstDurga();
        ConstDurga c3 = new ConstDurga();
        ConstDurga c4 = new ConstDurga();
    }
}
*/

/*
class ConstDurga{
    String name;
    int age;
    ConstDurga(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args){
        ConstDurga c1 = new ConstDurga("Adarsh Tiwari" , 101);
        System.out.println(c1.name);
        System.out.println(c1.age);
    }
}
*/

/*
class ConstDurga{
    String name;
    int age;
    ConstDurga(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args){
        ConstDurga c1 = new ConstDurga("Adarsh", 101);
        ConstDurga c2 = new ConstDurga("Tiwari", 101);

        System.out.println(c1.name + " " + c1.age);
        System.out.println(c2.name + " " + c2.age);
    }
}
*/

/*
class ConstDurga{
    ConstDurga(){
        System.out.println("Ram-Sita");
    }
    public static void main(String[] args){
        ConstDurga c1 = new ConstDurga();
        ConstDurga c2 = new ConstDurga();
        ConstDurga c3 = new ConstDurga();
    }
}
*/

/*
class ConstDurga{
    ConstDurga(){
        super();
        System.out.println("Hello");
        // super(); // call to super must be first statement in constructor
    }
    public static void main(String[] args){
        ConstDurga c1 = new ConstDurga();
    }
}
*/

/*
class ConstDurga {
    ConstDurga() {
        super(); // Calls the superclass constructor (Object)
        System.out.println("Hello"); // Prints "Hello" to the console
    }

    public static void main(String[] args) {
        ConstDurga c1 = new ConstDurga(); // Creates an instance of Hello, triggering the constructor
    }
}
*/

/*
class ConstDurga {
    ConstDurga() {
        super(); // Calls the superclass constructor (Object)
        this(); // error this program
        System.out.println("Hello"); // Prints "Hello" to the console
    }

    public static void main(String[] args) {
        ConstDurga c1 = new ConstDurga(); // Creates an instance of Hello, triggering the constructor
    }
}
*/

/*
class P {
    String name = "Parent Class";
}

class C extends P {
    String name = "Child Class";

    public void m1() {
        System.out.println(name);         // Refers to the child class 'name'
        System.out.println(this.name);    // Refers to the child class 'name' (using 'this')
        System.out.println(super.name);   // Refers to the parent class 'name' (using 'super')
    }
}

class ConstDurga {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m1();  // Corrected to call 'm1' using the object 'c1'
    }
}
*/


/*
class P {
    String name = "Parent Class";
}

class C extends P {
    String name = "Child Class";

    public static void m1() { // non static variable so error
        System.out.println(name);         // Refers to the child class 'name'
        System.out.println(this.name);    // Refers to the child class 'name' (using 'this')
        System.out.println(super.name);   // Refers to the parent class 'name' (using 'super')
    }
}

class ConstDurga {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m1();  // Corrected to call 'm1' using the object 'c1'
    }
}
*/



// Constructor Overloading 
/*
class ConstDurga{
    ConstDurga(double d){
        this(10);
        System.out.println("Double-Arg-Constructor");
    }
    ConstDurga (int d){
        this();
        System.out.println("Int-Arg-Constructor");
    }
    ConstDurga(){
        System.out.println("No-Arg-Constructor");
    }
    public static void main(String[] args){
        ConstDurga t1 = new ConstDurga(10.5);
        ConstDurga t2 = new ConstDurga(10);
       // ConstDurga t3 = new ConstDurga();
    }
}
*/


/*
class p {
    // Default constructor
    p() {
        System.out.println("Parent class constructor called");
    }
}

class c extends p {
    // Constructor with integer parameter
    c(int i) {
        super();  // Call to superclass constructor
        System.out.println("Child class constructor called with value: " + i);
    }
}

public class ConstDurga {
    public static void main(String[] args) {
        // Creating an instance of subclass c with an integer argument
        c c1 = new c(10); // Corrected instantiation with an integer argument
    }
}
*/


/*
class ConstDurga{
    public static void m1(){
        m2();
    }
    public static void m2(){
        m1();
    }
    public static void main(String[] args){
        System.out.println("Hello");
    }
}
*/



/*
class ConstDurga {
    public static void m1() {
        System.out.println("Inside m1");
    }

    public static void m2() {
        System.out.println("Inside m2");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        m1();  // Call m1
        m2();  // Call m2
    }
}
*/


/*
class ConstDurga{
    ConstDurga(){
        this(10);
    }
    ConstDurga(int i){
        this(); 
    }
    public static void main(String[] args){
        System.out.println("Hell0"); // recursive constructor invocation  
    }
}
*/


/*
class ConstDurga {
    // No-argument constructor
    ConstDurga() {
        System.out.println("No-argument constructor called");
    }

    // Constructor with integer parameter
    ConstDurga(int i) {
        this();  // Calls the no-argument constructor
        System.out.println("Constructor with int parameter called: " + i);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        // Create an instance of ConstDurga with an integer argument
        ConstDurga obj = new ConstDurga(10);
    }
}
*/


/*
class ConstDurga {
    // No-argument constructor
    ConstDurga() {
        System.out.println("No-argument constructor called");
    }

    // Constructor with integer parameter
    ConstDurga(int i) {
       // this();  // Calls the no-argument constructor
        System.out.println("Constructor with int parameter called: " + i);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        // Create an instance of ConstDurga with an integer argument
        ConstDurga obj = new ConstDurga(10);
    }
}
*/