// this keyword 
/*
class Test{
    int i;
    void setValue(int x){
        i=x;
    }
    void show(){
        System.out.println(i);
    }
}
class This{
    public static void main(String[] args){
        Test t = new Test();
        t.setValue(10);
        t.show();
    }
}
*/

// instance variable and local variable ke naam same provide karne per 0 ans provide karta hai
// instance variable and local variable ka naam same hone per this keyword ka use karte hai. 
// this keyword na lagane per instance variable ke dafault value print kar deta hai.

class Test{
    int i; // instance
    void setValue(int i){   // local variable
        this.i=i;  // last wali i local variable ko reffer karega equal ke baad wali i , and this ke side wali i instance variable ko reffer karega
    }
    void show(){
        System.out.println(i);
    }
}
class This{
    public static void main(String[] args){
        Test t = new Test();
        t.setValue(10);
        t.show();
    }
}