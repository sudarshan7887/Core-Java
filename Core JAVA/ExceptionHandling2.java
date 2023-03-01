
//Exception Handling with throw keyword
public class ExceptionHandling2 {
    public static void main(String[] args) {
        int i = 0;
        int j =0;

        try{
            j = 12/0;
            if(j ==0)
                throw new Exception("It is not possible of 0");
        }
        catch (Exception e){
            j= 18/1;
            System.out.println("It is default value");
        }
        //finally block is used for close the resources
        finally {
            System.out.println(j);
            System.out.println("Bye!");
        }

    }
}
