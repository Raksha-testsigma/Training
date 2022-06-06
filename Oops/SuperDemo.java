import java.util.Optional;

class Employee{
    public void details_show(){
        System.out.println("Name Emp");
        System.out.println("ID Emp");
    }
}
class Tester extends Employee{
    @Override
    public void details_show() {
        System.out.println("Tester Rank");
        System.out.println("No of Cases Written");

    }
}


public class SuperDemo {
    public static void main(String[] args) {
        Tester t = new Tester();
        t.details_show();
    }
}
