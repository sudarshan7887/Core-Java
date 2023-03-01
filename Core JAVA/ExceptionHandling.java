public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int i =0;
        int j =0;
            try
                {
                     j = 18/i;
                }
            //Arithmatic Exception because you cannot divide by 0
            //catch block is executed only case of exception otherwise skip
        catch (Exception e)
                {
                    System.out.println("something went wrong...");
                }
        System.out.println(j);
        System.out.println("Bye");


    }
}
