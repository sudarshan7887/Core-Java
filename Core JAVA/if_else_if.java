import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x = sc.nextInt();
        System.out.println("Enter value of y:");
        int y = sc.nextInt();
        System.out.println("Enter value of z");
        int z = sc.nextInt();

//if many statement available in any block then use { }
        if(x>z)
            System.out.println("x is maximum:");
        else if (y>z)
            System.out.println("y is maximum:");
        else
            System.out.println("Z is maximum;");
        }
    }
