
class Inst{
    public void eat(){
        System.out.println("I am eating");
    }
    public static void main(String[] args){
        Inst i = new Inst();
        i.eat();

        i.run();

        Ram r1 = new Ram(); // Dushre class ka new object banana padta hai.
        r1.fly();
    }
    public void run(){
        System.out.println("I am running");
    }
}
class Ram{
    void fly(){
        System.out.println("I am flying");
    }
}