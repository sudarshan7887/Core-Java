import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEachMethod {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(12, 23, 4, 56, 54, 3, 98);

        //print list using normal for loop
        System.out.println("normal for loop:");
        for (int i = 0; i < list1.size(); i++)
            System.out.println(i);

        //print using enhanced for loop
        System.out.println("Enhanced for loop:");
        for (int i : list1)
            System.out.println(i);

        //print using for each method
        System.out.println(" for each method:");
        list1.forEach(i -> System.out.println(i));
    }
}