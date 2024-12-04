
class Tiwari {
    void showTiwari() {
        System.out.println("A class method from Tiwari");
    }
}

class SingleInh extends Tiwari {
    @Override
    void showTiwari() {
        System.out.println("Overridden method from SingleInh");
    }

    void showSingleInh() {
        System.out.println("A method from SingleInh");
    }

    public static void main(String[] args) {
        // Creating object of Tiwari class
        Tiwari t1 = new Tiwari();
        t1.showTiwari();

        // Creating object of SingleInh class
        SingleInh s1 = new SingleInh();
        s1.showTiwari();
        s1.showSingleInh();
    }
}
