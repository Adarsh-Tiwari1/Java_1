
// Use-1 : "this keyword is used to invoke current class instance variable

/*
class This2{
    int i;
    void setValue(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);
    }
    public static void main(String[] args){
        This2 t = new This2();
        t.setValue(100);
        t.show();
    }
}
*/

// Use-2 : this keyword can be used to invoke current class method (implicitly)

/*
class This2{
    
    void display(){
        System.out.println("Hello");
    }
    void show(){
        this.display();  // if you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
    }
    public static void main(String[] args){
        This2 t = new This2();
        t.show();
    }
}
*/

// Use - 3 : this() keyword can be used to invoke current class constructor

/*
class This2{
    This2(){
        System.out.println("no argument constructor");
    }
    This2(int a){
        System.out.println("parametrised constructor");
    }
    public static void main(String[] args){
        This2 t = new This2();
    }
}
*/

/*
class This2{
    This2(){
        System.out.println("no argument constructor");
    }
    This2(int a){
        System.out.println("parametrised constructor");
    }
    public static void main(String[] args){
        This2 t = new This2(10);
    }
}
*/ 

/*
class This2{
    This2(){
        this(10);
        System.out.println("no argument constructor");
    }
    This2(int a){
        System.out.println("parametrised constructor");
    }
    public static void main(String[] args){
        This2 t = new This2();
    }
}
*/


// Use - 4 : this keyword can be used to pass as an argument in the method call.

/*
class This2 {
    void m1(This2 t) {
        System.out.println("1m in m1 method");
    }

    void m2() {
        m1(this); // Passes the current object (this) to m1()
    }

    public static void main(String[] args) {
        This2 t = new This2(); // Correct class name
        t.m2(); // Calls m2() method
    }
}
*/


// Use - 5 : this keyword can be used to pass as an argument in the constructor call

/*
class Text {
    Text() {
        System.out.println("Text class constructor");
    }
}

class This2 {
    void m() {
        Text t = new Text(); // Creates a new Text object
    }

    public static void main(String[] args) {
        This2 obj = new This2(); // Create an instance of This2
        obj.m(); // Call the m() method, which creates a Text object
    }
}
*/



// Use - 6 : this keyword can be used to return the current class instance from the method.

class This2{
    This2 n(){
        return this;
    }
    public static void main(String[] args){
        This2 t = new This2();
        t.n();
    }
}