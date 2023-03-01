import pakages.calc;
import pakages.advcalc;
public class packageDemo
{
    public static void main(String[] args)
    {
        calc  c = new calc();
        System.out.println("addition is:"+c.add(12,10)+"\n substraction is:"+c.sub(20,10));
        advcalc obj = new advcalc();
        System.out.println("Multiplication is:"+obj.mul(10,10)+"\n division is:"+obj.div(10,5));
    }

}
