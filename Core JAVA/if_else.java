import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int a = sc.nextInt();
        System.out.println("Enter second value:");
        int b = sc.nextInt();

        if(a>b)
            System.out.println("a is maximum");
        else
            System.out.println("b is maximum");

    }
}
