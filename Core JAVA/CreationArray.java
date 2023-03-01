import java.util.Arrays;

public class CreationArray {
    public static void main(String[] args)
    {
        //Array index Sarting with index 0

        int nums[] = new int[4];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 22;

        System.out.println(nums[0]);
        System.out.println("output of first method is:");
        for (int j =0;j<4;j++)
            System.out.println(nums[j]);

                        //or
        int arr[] = {19,43,54,12,34,39};
        System.out.println("output of second method is:");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

        //print using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int i:arr)
            System.out.println(i);
    }
}
