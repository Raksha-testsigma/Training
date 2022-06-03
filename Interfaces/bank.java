
class karur implements in {
    public void interestmoney(int a){

        System.out.println(a*10);
    }
}
class iob implements in{
    public void interestmoney(int b){
        System.out.println(b*20);
    }
}
class sbi implements in{
    public void interestmoney(int c){
        System.out.println(c*30);

    }
}
public class bank{

    public static void main(String[] args) {
        iob intt=new iob();
        in.interestmoney(5);
    }
}
