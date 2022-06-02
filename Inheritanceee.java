// filename Inheritanceee.java

class InheritanceDemo {
    public static int add(int i, int j) {
        return i+j;
    }
}
class Advcalc extends InheritanceDemo{   // IS - A
    public static int sub(int i,int j){
        return i-j;
    }
}
class superAdv extends Advcalc{
    public static int mul(int i, int j) {
        return i*j;
    }
}
public class Inheritanceee{
    public static void main(String[] args) {
        superAdv a = new superAdv();   //HAS - A
        int res1=a.add(5,7);
        int res2=a.sub(7,3);
        int res3 = a.mul(3,3);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
