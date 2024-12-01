
// Abstract class 

/*
class Abstraction{
    void start();
}
*/


/*
abstract class Vehicle{
    abstract void start(); // aagar kisee ve class ke under abstract method aata hai to o class abstract home complusery hai
}
class Car extends Vehicle{ // koi ve class aager abstract class ko extends karta hai to uss class ka under abstract method ke body banana compelusry hai
    void start(){
        System.out.println("car start with kdy");
    }
}
class Abstraction extends Vehicle{
    void start(){
        System.out.println("stooter start with key");
    }
    public static void main(String[] args){
       // Vehicle v = new Vehicle(); // abstract class ka object create nahi kar sakte  .
       Car c = new Car();
       c.start();

       Abstraction a = new Abstraction();
       a.start();
    }
}
*/




/// Interfaces  in java 

/*
interface I1 {
    void show();
}

class Abstraction implements I1 {
    public void show() {
        System.out.println("1");
    }

    public static void main(String[] args) {
        Abstraction a = new Abstraction();
        a.show();
    }
}
*/


// Multiple Inheritance


interface I1 {
    void show();
}
interface I2{  // interface multiple inheritance ko support karta hai.
    void display();
}

class Abstraction implements I1, I2 { // 
    public void show() {
        System.out.println("1");
    }
    public void display(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Abstraction a = new Abstraction();
        a.show();

        a.display();
    }
}
