
//@FunctionalInterface annotation is used for there is only one method in interface
//lambda expression is only work with functional interface
@FunctionalInterface
interface pqr{
    void show();
}

@FunctionalInterface
interface pqr1{
    int display(int i,int j);


}
public class LambdaExpression {
    public static void main(String[] args)
    {

        //annonymous class
//        pqr obj = new pqr()
//        {
//            public void show() {
//                System.out.println("in show");
//            }
//        };

        //Annonymous class written using lambda expression i.e=>
        pqr obj =()-> System.out.println("In show");
        obj.show();

//        lambda express using return statement

//        pqr1 obj1 = new pqr1() {
//            @Override
//            public int display(int i, int j) {
//                return i+j;
//            }
//        };

        //This are using lambda expression
        pqr1 obj1 = (i, j) -> i+j;
        System.out.println(obj1.display(4,5));
    }
}
