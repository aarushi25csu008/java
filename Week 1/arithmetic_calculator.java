import java.util.Scanner;
public class arithmetic_calculator{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.println("This is a Arithmetic Calculator!");
        System.out.println("1-Addition /n 2-Subtraction /n 3-multiplication /n 4-division");
        int choice=ab.nextInt();
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
                int multi=num1*num2;
                System.out.println("the multiplication is:"+multi);
                break;
            case 4:
                int div=num1/num2;
                System.out.println("the division is:"+div);
                break;
        }
    }
}
