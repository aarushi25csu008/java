import java.util.Scanner;
public class menu_driven_calculator{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.println("This is a menu driven calculator");
        System.out.println("1-addition \n 2-subtraction \n 3-multiplication \n 4-division");
        int choice= ab.nextInt();
        System.out.println("enter the first number:");
        int num1=ab.nextInt();
        System.out.println("enter the second number:");
        int num2=ab.nextInt();
        switch(choice){
            case 1:
                int sum=num1+num2;
                System.out.println("the addition is:"+sum);
                break;
            case 2:
                int sub=num1-num2;
                System.out.println("the subtraction is:"+sub);
                break;
            case 3:
                int mul=num1*num2;
                System.out.println("the multiplication is:"+mul);
                break;
            case 4:
                int div=num1/num2;
                System.out.println("the division is:"+div);
                break;
        }
    }
}