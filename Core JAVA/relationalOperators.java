import java.util.Scanner;

public class relationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int x = sc.nextInt();
        System.out.println("Enter second value:");
        int y = sc.nextInt();
        //relational operators:->
//                    <,>,<=,>=,!=,==
        boolean result = x!=y;

        System.out.println(result);
    }
}
