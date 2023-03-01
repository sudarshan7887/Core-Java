public class wrapperClasses {
    public static void main(String[] args) {

        //autoboxing=>directly assign primitive value to the object type
        int num = 8;
        Integer num1 = num;         //auto-boxing

        //auto-unboxing=>directly fetch value automatically
        int num2 = num1;                //auto-unboxing

        String number = "12";
        int number2 = Integer.parseInt(number);     //convert string into integeer
        System.out.println(number2*4);

    }
}
