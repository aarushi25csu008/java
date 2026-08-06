//programm to convert temperature
import java.util.Scanner;
public class Temperature_converter{
    public static void main(String[] args)throws Exception{
        Scanner ab=new Scanner(System.in);
        System.out.println("enter the temperature in celsius:");
        int C=ab.nextInt();
        double F;
        F=(C*1.8)+32;
        System.out.println("the temperature in farenhite is:"+F);
    }
}