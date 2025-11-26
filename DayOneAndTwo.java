import java.util.Scanner;

public class DayOneAndTwo {
    public static void main(String[] args) {

        // This file contains the codes done on Monday and Tuesday, i.e., Day1 and Day2

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);

        System.out.print("Enter your name = ");
        String name = sc.nextLine();

        System.out.println(name);

        System.out.println("*\n**\n***\n****\n*****");

        // int a = 5; int b = 10;
        String nameTag = "Shivam Bansal";

        System.out.println(nameTag);


        // byte b = -128;
        short s = 5;
        int i = 5;
        long l = 5;

        float f = 23;
        double d = 2445;

        char character = '&';
        boolean bool = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        
        System.out.println(f);
        System.out.println(d);
        
        System.out.println(character);
        System.out.println(bool);


        // int a = 30;
        // int b = 10;

        System.out.println( (a * b) / (a - b));
        System.out.println(5 + 10);
        
        sc.close();



    }
}
