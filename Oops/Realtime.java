class Personal_Details {
    String name;
    long reg_no;
    String dept;
    double sem1,sem2,sem3;
    double cgpa;
    Personal_Details(){
        System.out.println("Printing Personal Details:");
    }
    void insert(String n,long r_no,String dep,double semes1,double semes2,double semes3){
        name = n;
        reg_no = r_no;
        dept = dep;
        sem1 = semes1;
        sem2 = semes2;
        sem3 =semes3;
    }
    void show(){
        System.out.println("Name:"+" "+name);
        System.out.println("Register Number:"+" "+reg_no);
        System.out.println("Department of Study:"+" "+dept);
    }
}
class Academic extends Personal_Details{
    void compute(){
        Realtime.cgpa = (sem1+sem2+sem3)/3;
    }
    @Override
    void show(){
        super.show();
        System.out.println("CGPA: "+Realtime.cgpa);
    }
}
abstract class Result {
    public abstract void end_func();
}
class Final extends Result
{
    public void end_func() {
        if(Realtime.cgpa>=6.0) {
            System.out.println("Pass");
        }
    else{
        System.out.println("Fail");
    }
    }
}
    public class Realtime {
    public static double cgpa;
    public static void main(String[] args) {
        Academic a2 = new Academic();
        a2.insert("Raksha",19080167,"CSE",8.1,7.3,8.5);
        a2.compute();
        a2.show();
        Final f = new Final();
        f.end_func();
    }
}
