class Employe {
    private int empid;  // data hiding
    
    public void setEmpid(int eid) {  // setter method
        empid = eid;
    }

    public int getEmpid() {  // getter method (not "gether")
        return empid;
    }
}  // iss line ke upar ke sabhi data ko encapsulation bolte hai

class Encapsulation {
    public static void main(String[] args) {
        Employe e = new Employe();
        e.setEmpid(101);
        System.out.println(e.getEmpid());  // parentheses added to call the method
    }
}
