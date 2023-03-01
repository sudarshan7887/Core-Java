import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first value:");
       int num1 = sc.nextInt();

        System.out.println("Enter your first value:");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        float div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("The addition is: "+add);
        System.out.println("The substraction is:"+sub);
        System.out.println("The multiplication is:"+mul);
        System.out.println("The division is: "+div);
        System.out.println("The remainder is: "+mod);

        // in short hand
      // num1 +=10;
//        num1 -=10;
//        num1 *=2;
//        num1 /=3;
        num1++;     //post increment
       // num1--;       //post decrement
        --num2;       //pre decrement
       // ++num2;     //pre increment

        System.out.println(num1);
        System.out.println(num2);




    }
}
