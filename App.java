
// import java.util.Scanner;
// public class App {
//     public static void main(String[] args) throws Exception {
//     int a= 10;
//     int b= 20;
//     int sum=a+b;
//     System.out.print("the sum is:");
//     System.out.println(sum);
//     }
// }

// import java.util.Scanner;
// public class App{
//     public static void main(String[] args) throws Exception{
//         System.out.println("please enter your name");
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         System.out.println(name);
//     }
// }

//Take the user's name as input and print the name with a hello
// import java.util.Scanner;
// public class App{
//     public static void main(String[] args)throws Exception{
//         System.out.println("enter your name:");
//         Scanner sc = new Scanner(System.in);
//         String name=sc.next();
//         System.out.println("hello,"+name);
//     }
// }

import java.util.Scanner;
public class App{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age= sc.nextInt();
        System.out.println("you are" + age + "years old.");
    }
}