
class Hello{
    public void m1(){
        System.out.println("Parent class");
    }
}
class Hii extends Hello{
    public void m2(){
        System.out.println("Child class");
    }
}
class InheriDurga{
    public static void main(String[] args){
        Hello h1 = new Hello();
        h1.m1();
        h1.m2();
    }
}
