import java.util.Scanner;
public class leap_year{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.println("enter your leap:");
        int year=ab.nextInt();
        if((year%4==0||year%10!=0)||(year%400==0)){
                System.out.println("this year is a leap year");
        }
        else{
            System.out.println("this year is not leap year");
        }
    }
}