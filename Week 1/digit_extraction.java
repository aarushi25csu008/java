import java.util.Scanner;
public class digit_extraction{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.println("enter your number:");
        int number =ab.nextInt();
        int ones = number % 10;
        number = number / 10;

        int tens = number % 10;
        number = number / 10;

        int hundreds = number % 10;
        number = number / 10;

        int thousands = number % 10;
        System.out.println("ones:"+ones);
        System.out.println("tens:"+tens);
        System.out.println("hundreds:"+hundreds);
        System.out.println("thousands:"+thousands);
    }
}