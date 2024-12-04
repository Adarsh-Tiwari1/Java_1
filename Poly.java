/*
class Poly{
    void show(){
        System.out.println("a");
    }
    void show(){
        System.out.println("B");
    }
    public static void main(String[] args){
        Poly p = new Poly();
        p.show(); // compiler confuse kon se show() ko call karna hai
    }
}
*/


/*
class Poly{
    void show(){
        System.out.println("show method");
    }
    void Show(){
        System.out.println("Show method");
    }
    void Show1(){
        System.out.println("Show1 method");
    }
    public static void main(String[] args){
        Poly p1 = new Poly();
        p1.show();

        p1.Show();

        p1.Show1();
    }
}
*/



/*
class Poly{
    void show(){
        System.out.println("a");
    }
    void show(int a){
        System.out.println("B");
    }
    public static void main(String[] args){
        Poly p = new Poly();
        p.show();
    }
}
*/



/*
class Poly{
    void show(int a, String b){
        System.out.println("a");
    }
    void show(String a, int b){
        System.out.println("B");
    }
    public static void main(String[] args){
        Poly p = new Poly();
        p.show(10, "abc");
    }
}
*/



/*
class Poly{
    public static void main(String[] args){
        System.out.println("a");
    }
    public static void main(int a){
        System.out.println("b");
    }
}
*/


/*
class Poly{
    public static void main(String[] args){
        System.out.println("a");
        Poly obj = new Poly();
        obj.main(20);
    }
    public static void main(int a){
        System.out.println("b");
    }
}
*/

/*
class Poly{
    public static void main(String[] args){
        System.out.println("1st main method");
    }
    public static void main(){
        System.out.println("2st main method");
    }
}
*/

/*
class Poly{
    public static void main(String[] args){
        System.out.println("1st main method");
        Poly p1 = new Poly();
        p1.main();
    }
    public static void main(){
        System.out.println("2st main method");
    }
}
*/


/*
class Poly{
    void show(int a){
        System.out.println("int method");
    }
    void show(String a){
        System.out.println("string method");
    }
    public static void main(String[] args){
        Poly p = new Poly();
        p.show('a'); // Automatic Promotion

    }
}
*/


/*
class Poly{
    void show(Object a){
        System.out.println("object method");
    }
    void show(String a){
        System.out.println("string method");
    }
    public static void main(String[] args){
        Poly p = new Poly();
        p.show("adarsh"); // while resolving Overloaded methode, compiler will always give precedence for the child type argument than compared with parent type argument

       // p.show(10);
    }
}
*/

/*
class Poly{
    void show(String name){
        System.out.println("1st void show()");
    }
    void Show(String name){
        System.out.println("2nd void show()");
    }
    public static void main(String[] args){
        Poly p1 = new Poly();
        p1.show("Adarsh");
    }
}
*/


/*
class Poly{
    void show(StringBuffer a){
        System.out.println("StringBuffer method");
    }
    void show(String a){
        System.out.println("string method");
    }
    public static void main(String[] args){
        Poly p = new Poly();

        p.show("Adarsh"); 
        p.show(new StringBuffer("Tiwari")); // new StringBuffer("Tiwari") creates a StringBuffer object.

    }
}
*/


/*
class Poly{
    void show(int num){
        System.out.println("int method");
    }
    void show(short num){
        System.out.println("short method");
    }
    public static void main(String[] args){
        Poly p1 = new Poly();

        p1.show(20);
        p1.show((short)10);
    }
}
*/


/*
class Poly{
    void show(int a, float b){
        System.out.println("int float method");
    }
    void show(float a, int b){
        System.out.println("float int method");
    }
    public static void main(String[] args){
        Poly p = new Poly();
        p.show(10,20.5f); 

    }
}
*/