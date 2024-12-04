
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

class MultiInhe extends B {
    void showMultiInhe() {
        System.out.println("C class method");
    }

    public static void main(String[] args) {
        // Creating object of A class
        A obj = new A();
        obj.showA();  // Calls A's method

        // Creating object of B class
        B obj1 = new B();
        obj1.showA();  // Inherited from A
        obj1.showB();  // Calls B's method

        // Creating object of MultiInhe class
        MultiInhe obj2 = new MultiInhe();
        obj2.showA();  // Inherited from A
        obj2.showB();  // Inherited from B
        obj2.showMultiInhe();  // Calls MultiInhe's method
    }
}
