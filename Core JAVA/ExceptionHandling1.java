
public class ExceptionHandling1
{
    public static void main(String[] args)
    {
        int i = 2;
        int j = 0;

        int nums[] ={1,2,3,4,5};

        String str = null;

        //try with multiple catch block

        try{
            j = 12/i;
            System.out.println(nums[4]);
            System.out.println(str.length());
        }
        catch (ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array length of nums is 0-4 only");
        }
        catch (Exception e){
            System.out.println("String is null can't print its length");
        }
        System.out.println(j);


    }
}
