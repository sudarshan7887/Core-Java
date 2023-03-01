
class Calc1{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
//in 'add' method of Calc2 override the 'add' method of Calc1
class Calc2 extends Calc1{
    public int add(int n1,int n2){
        return n1 +n2+1;
    }
}
public class MethodOverriding
{
    public static void main(String[] args) {
        Calc2 c = new Calc2();

        int a = c.add(2,3);
        System.out.println(a);

        //or
        //System.out.println(c.add(2,3));
    }
}
