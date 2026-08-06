import java.util.Scanner;
public class Simple_intrest{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.println("enter the principle amount:");
        int principle=ab.nextInt();
        System.out.println("enter the rate:");
        int rate=ab.nextInt();
        System.out.println("enter the time:");
        int time=ab.nextInt();
        int SI;
        SI=(principle*rate*time)/100;
        System.out.println("the simple intrest is:"+SI);
    }
}
