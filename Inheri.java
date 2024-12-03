
/*
class Dog{
    void eat(){
        System.out.println("I am eating");
    }
}   
class Inheri extends Dog{
    public static void main(String[] args){
        Inheri i1 = new Inheri();
        i1.eat();
    }
}
*/

/*
class Dog{
    void eat(){
        System.out.println("I am eating");
    }
    void cat(){
        System.out.println("I am cat");
    }
}   
class Inheri extends Dog{
    public static void main(String[] args){
        Inheri i1 = new Inheri();
        i1.eat();
        i1.cat();
    }
}
*/


/*
class Car{
    void color(){
        System.out.println("This is parent class");
        System.out.println("This is 2nd parent class");
    }
}
class Inheri extends Car{
    public static void main(String[] args){
        System.out.println("This is main method");
        System.out.println("This in 2nd main method");
        Inheri i1 = new Inheri();
        i1.color();
    }
}
*/


/*
class Cat{
    void eat(){
        System.out.println("Cat is Eating");
        System.out.println("Cat is Running");
    }
}
class Inheri extends Cat{
    public static void main(String[] args){
        System.out.println("Main Method");  // main method execute first 

        Inheri h1 = new Inheri();
        h1.eat();
    }
}
*/

// Java doesn't support multiple inheritance with classes.
// Java doesn't allow a class to extend more than one class.

// You can use interfaces instead if you need multiple inheritance.


/*  // error this code
class Mobile{
    public void Sim(){
        System.out.println("This is Parent Class");
    }
}
// Sim2 method in the Mobile2 interface should not have any implementation (i.e., no { ... } block).
interface Mobile2{  // in Java, interfaces cannot have method bodies  // mobile2 interface
    public void Sim2(){ // sim2 method
        System.out.println("This is 2nd Sim2 Class");
    }
}
class Inheri extends Mobile implements Mobile2{
    public static void main(String[] args){
        System.out.println("This is main Class");
        Inheri i1 = new Inheri();
        i1.Sim();
        i1.Si2();
    }
}
*/

/*
class Monkey{
    void Baby(){
        System.out.println("System");
    }
}
interface Cow {
    void Calf();
}
class Inheri extends Monkey implements Cow{
    public void Calf(){
        System.out.println("Interface COw");
    }

    public static void main(String[] arg){
    }
}    
*/



/*
class Dog {
    void Show() {
        System.out.println("This is Parent Class");
    }
}

interface Horse {
    void Run();
}

class Inheri extends Dog implements Horse {
    public void Run() {
        System.out.println("Hi");
    }
    
    void Cat() {
        System.out.println("This is main parent class");
    }

    public static void main(String[] args) {
        System.out.println("This is main class");
        Inheri i1 = new Inheri();
        i1.Show();
        i1.Run();
        i1.Cat();
    }
}
*/