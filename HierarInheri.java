class A {
    void showA() {
        System.out.println("A class method");
    }
}

class B extends A {
    void showB() {
        System.out.println("B class method");
    }
}

class C extends A {
    void showC() {
        System.out.println("C class method");
    }
}

public class HierarInheri {
    public static void main(String[] args) {
        // Creating object of A class
        A objA = new A();
        objA.showA();  // Calls A's method

        // Creating object of B class
        B objB = new B();
        objB.showA();  // Inherited from A
        objB.showB();  // Calls B's method

        // Creating object of C class
        C objC = new C();
        objC.showA();  // Inherited from A
        objC.showC();  // Calls C's method
    }
}
