import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x = sc.nextInt();
        System.out.println("Enter value of y: ");
        int y = sc.nextInt();
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();

//        boolean result = x>y && a<b;        //both true then true
        boolean result = x>y || a<b;                //both false then false otherwise true
    //    boolean result = x>y;
        System.out.println(result);
      //  System.out.println(!result);               //if true then false and false then true


    }
}
