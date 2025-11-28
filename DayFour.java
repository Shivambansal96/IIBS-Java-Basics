
import java.util.Scanner;

public class DayFour {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // // // Max of Two Numbers:
        // System.out.print("Enter num 1 = ");
        // int a = sc.nextInt();
        // System.out.print("Enter num 2 = ");
        // int b = sc.nextInt();
        // if(a > b)
        //     System.out.println(a + " is the greatest");
        // else
        //     System.out.println(b + " is the greatest");
        // System.out.println(2 == 9 ? "Same value" : "Different Value" );
        // // // Making a calculator using if-else:
        // System.out.print("Enter the first number = ");
        // int a = sc.nextInt();
        // System.out.print("Enter the second number = ");
        // int b = sc.nextInt();
        // System.out.print("Enter the operator (+, - , *, /) = ");
        // char operator = sc.next().charAt(0);
        // if(operator == '+') {
        //     int add = a + b;
        //     System.out.println("Sum = " + add);
        // }
        // else if(operator == '-') {
        //     int diff = a - b;
        //     System.out.println("Difference = " + diff);
        // }
        // else if(operator == '*') {
        //     int mul = a * b;
        //     System.out.println("Multiple = " + mul);
        // }
        // else if(operator == '/') {
        //     int div = a / b;
        //     System.out.println("Difference = " + div);
        // }
        // else 
        //     System.out.println("Abeeyy gadhe padhai kar.");



        // // // Making a calculator using SWITCH-CASE
        // System.out.print("Enter the first number = ");
        // int a = sc.nextInt();

        // System.out.print("Enter the second number = ");
        // int b = sc.nextInt();

        // System.out.print("Enter the operator (+, - , *, /) = ");
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        //     case '+':
        //         System.out.println("Sum = " + (a+b));
        //         // break;

        //     case '-':
        //         System.out.println("Difference = " + (a-b));
        //         break;

        //     case '*':
        //         System.out.println("Multiple = " + (a*b));
        //         break;

        //     case '/':
        //         System.out.println("Divisible = " + (a/b));
        //         break;

        //     default:
        //         System.out.println("Invalid Operator");
        // }


        // String s1 = "Shivam ";
        // String s2 = "S";
        // System.out.println(s1.charAt(5)); // 'm'
        // System.out.println(s1.charAt(6)); // ' '  Empty Space
        // System.out.println(s1.charAt(0)); // 'S'

        
        // System.out.println("a " + "b");
        // System.out.println("a" + " b");
        // System.out.println("a"+ " " + "b");

        String fName = "Shivam";
        String lName = "Bansal";
        
        // System.out.println(fName + " " + lName);

        
        // // String a = sc.next();
        // String a = "Telling";
        // String b = "e";

        // System.out.println(fName.concat(lName));
        // System.out.println(fName.equals(lName));
        // System.out.println(a.compareTo(b));
        // System.out.println(a.contains(b));
        // System.out.println(a.replace("l", "k"));
        // System.out.println(a.replaceFirst("l", "K"));
        // System.out.println(a.length());
        // System.out.println(a.endsWith("vam."));
        // System.out.println(a.equalsIgnoreCase(b));
        // String a = sc.next();



        String a = "        Shivam     ".strip();
        String b = "shIvam";

        System.out.println(a);
        System.out.println(a.length());

        System.out.println(a.equalsIgnoreCase(b));

        System.out.println(a.length());

    }
}
