import java.util.Scanner;
public class grading_system{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks=ab.nextInt();
        if(marks>=90){
            System.out.println("A+");
        }
        else if(marks>=80){
            System.out.println("A");
        }
        else if(marks>=70){
            System.out.println("B+");
        }
        else if(marks>=50){
            System.out.println("B");
        }
        else{
            System.out.println("F");
        }
    }
}