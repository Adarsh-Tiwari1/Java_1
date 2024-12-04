// Method Overriding 
/*
class Test{
    void show(){
        System.out.println("a");
    }
}
class Poly2 extends Test{
    void show(){
        System.out.println("b");
    }
    public static void main(String[] args){
        Test t = new Test();
        t.show();

        Poly2 p = new Poly2();
        p.show();
    }
}
*/



class Cow {
    Object show() {
        System.out.println("a");
        return null;
    }
}

class Poly2 extends Cow {
    String  show() {
        System.out.println("b");
        return null;
    }

    public static void main(String[] args) {
        Cow c = new Cow();
        c.show(); 

        Poly2 p = new Poly2();
        p.show(); 
    }
}



// Access Modifier 

/*
class Cow {   // parent class
    void  show() {
        System.out.println("a");
    }
}

class Poly2 extends Cow {
    public void  show() {  // chile class ka access modifier , parent class ke access modifier se bda hona chaiya.
        System.out.println("b");
    }

    public static void main(String[] args) {
        Cow c = new Cow();
        c.show(); 

        Poly2 p = new Poly2();
        p.show(); 
    }
}
*/


// Overriding & Exception Handling 

/*
class Cow {   
    void  show() {
        System.out.println("a");
    }
}

class Poly2 extends Cow {
    void  show() throws ArithmeticException {  // unchecked exception
        System.out.println("b");
    }

    public static void main(String[] args) {
        Cow c = new Cow();
        c.show(); 

        Poly2 p = new Poly2();
        p.show(); 
    }
}
*/


/*
class Cow {   
    void  show() {
        System.out.println("a");
    }
}

class Poly2 extends Cow {
    void  show() throws Exception {  //  checked exception 
        System.out.println("b");
    }

    public static void main(String[] args) {
        Cow c = new Cow();
        c.show(); 

        Poly2 p = new Poly2();
        p.show(); 
    }
}
*/


/*
class Cow {   
    void  show() throws RuntimeException {
        System.out.println("a");
    }
}
class Poly2 extends Cow {
    void  show() throws RuntimeException {  
        System.out.println("b");
    }

    public static void main(String[] args) {
        Cow c = new Cow();
        c.show(); 

        Poly2 p = new Poly2();
        p.show(); 
    }
}
*/


// Overriding and Abstract Method 

/*
abstract class Cow {
    // Abstract method cannot have a body
    abstract void display();
}

class Poly2 extends Cow {
    // Implementing the abstract method from Cow
    @Override
    void display() {
        System.out.println("Display method in Poly2");
    }

    void show() {
        System.out.println("b");
    }

    public static void main(String[] args) {
        // Cow c = new Cow(); // Cannot instantiate an abstract class

        Poly2 p = new Poly2();
        p.display(); // Calls the overridden display method
        p.show();    // Calls the show method
    }
}
*/ 


// super keyword : child class ke object ke throwe parant class ke mthod ko ve call kar sakte hai.

/*
class Hii{
    void show(){
        System.out.println("a");
    }
}
class Poly2 extends Hii{
    void show(){
        super.show(); // child class ke object ke throwe parent class ko class karna hai to super keyword ka use karna hai
        System.out.println("b");
    }
    public static void main(String[] args){
        Poly2 p = new Poly2();
        p.show();
    }
}
*/


// final method can not be override

/*
class Ada{
    final void show(){  // final method can not be override
        System.out.println("a");
    }
}
class Poly2 extends Ada{
    void show(){
        System.out.println("b");
    }
    public static void main(String[] args){
        Poly2 p1 = new Poly2();
        p1.show();
    }
}
*/

// static method can not be override
/*
class Ada{
    static void show(){  // static method can not be override
        System.out.println("a");
    }
}
class Poly2 extends Ada{
    void show(){
        System.out.println("b");
    }
    public static void main(String[] args){
        Poly2 p1 = new Poly2();
        p1.show();
    }
}
*/


// private method can not be override
/*
class Ada{
    private void show(){  // private method can not be override // but ye run  karta hai , but final ke accessability within class hoti ahi
        System.out.println("a");
    }
}
class Poly2 extends Ada{
    void show(){
        System.out.println("b");
    }
    public static void main(String[] args){
        Poly2 p1 = new Poly2();
        p1.show();
    }
}
*/


// Overriding and synchronized/strictfp method


/*
class Ada{
    synchronized void show(){  
        System.out.println("a");
    }
}
class Poly2 extends Ada{
    void show(){
        System.out.println("b");
    }
    public static void main(String[] args){

        Ada a1 = new Ada();
        a1.show();

        Poly2 p1 = new Poly2();
        p1.show();
    }
}
*/


/*
class Ada{
    void show(){  
        System.out.println("a");
    }
}
class Poly2 extends Ada{
    synchronized void show(){   // chile method
        System.out.println("b");
    }
    public static void main(String[] args){

        Ada a1 = new Ada();
        a1.show();

        Poly2 p1 = new Poly2();
        p1.show();
    }
}
*/

/*
class Ada{
    void show(){  
        System.out.println("a");
    }
}
class Poly2 extends Ada{
    strictfp void show(){   // chile method
        System.out.println("b");
    }
    public static void main(String[] args){

        Ada a1 = new Ada();
        a1.show();

        Poly2 p1 = new Poly2();
        p1.show();
    }
}
*/