/*
class Const3{
    String name;
    int emp_id;
    
    Const3(String name, int emp_id){
        this.name=name;
        this.emp_id=emp_id;
    }
    public static void main(String[] args){
        Const3 c1 = new Const3("Adarsh", 10);
        Const3 c2 = new Const3("Tiwari", 20);
        System.out.println(c1.name + c1.emp_id);
        System.out.println(c2.name + c2.emp_id);
    }
}
*/

class Const3{
    String  name = "Adarsh";
    int age = 20;
    Const3(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args){
        Const3 h1 = new Const3();
    }
}