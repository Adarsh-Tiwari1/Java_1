
// super keyword is a reference variable which is used to refer immediate parent class object.

/*
class a{
    int i = 10;
}
class SuperKey extends a{
    int i = 20;
    void show(int i){
        System.out.println(i);
    }
    public static void main(String[] args){
        SuperKey ob = new SuperKey();
        ob.show(30);
    }
}
*/

/*
class a{
    int i = 10;
}
class SuperKey extends a{
    int i = 20;
    void show(int i){
        System.out.println(this.i); // this refer to the current class instance variable
    }
    public static void main(String[] args){
        SuperKey ob = new SuperKey();
        ob.show(30);
    }
}
*/

/*
class a{
    int i = 10;
}
class SuperKey extends a{
    int i = 20;
    void show(int i){
        System.out.println(super.i); // super refer to the parent class instance variable
    }
    public static void main(String[] args){
        SuperKey ob = new SuperKey();
        ob.show(30);
    }
}
*/



// Use of super Keyword .

// Use - 1 : super keyword refers to the immediate parent class instance variable

/*
class A{
    int i=10;
}
class SuperKey extends A{
    int i=20;
    void show(int i){
        System.out.println(i);
        System.out.println(this.i); // current class instance variable
        System.out.println(super.i); // parent class instance variable
    }
    public static void main(String[] args){
        SuperKey ob = new SuperKey();
        ob.show(30);
    }
}
*/


// Use - 2 :  super keyword can be used to invoke immediate parent class method .

/*
class A{
    void m1(){
        System.out.println("i am in class a");
    }
}
class SuperKey extends A{
    void show(){
        super.m1();
    }
    public static void main(String[] args){
        SuperKey ob = new SuperKey();
        ob.show();
    }
}
*/

/*
class A{
    void m1(){
        System.out.println("i am in class a");
    }
}
class SuperKey extends A{
    void m1(){
        System.out.println("i am in class b");
    }
    void show(){
        super.m1();
    }
    public static void main(String[] args){
        SuperKey ob = new SuperKey();
        ob.show();
    }
}
*/


// Use - 3 : super() can be used to invoke immediate parent class constructor .

//   super  : super keyword hai .
//   super() : constructor ke case me use hota hai.

/*
class A{
    A(){
        System.out.println("i am in class a");
    }
}
class SuperKey extends A{
    SuperKey(){
        System.out.println("i am in class b");
    }
    public static void main(String[] args){
        SuperKey ob = new SuperKey();
    }
}
*/