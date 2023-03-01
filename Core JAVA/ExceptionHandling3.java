
//Custom Exception
class myException extends Exception
{
    public  myException(String message)
    {
        super(message);
    }
}
public class ExceptionHandling3 {
    public static void main(String[] args)
    {
        int i = 20;
        int j =0;

        try{
            j = 18/i;
            if(j ==0)
               throw new myException("can't print the output 0");
        }
        catch (myException e){
            j= 18/1;
            System.out.println("It is default value:"+e);
        }

        System.out.println(j);
        System.out.println("Bye!");
    }
}
