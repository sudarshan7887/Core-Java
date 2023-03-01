import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        int result = 0;
/*
        if(n%2==0)
            result = 10;
        else
            result = 20;
*/
        //Above condition using Ternary operator
        result = n%2==0 ? 10 : 20;
        System.out.println(result);

    }
}
