public class typeCasting {
    public static void main(String[] args) {
        //type casting of byte to int
        byte b = 125;
        int a = b;
        System.out.println(a);

        //type casting int to byte
        int p = 12;
        byte q =(byte) p;
        System.out.println(q);

        //type casting float to int
        float f = 13.6f;
        int i = (int)f;
        System.out.println(i);

        //Type promotion
        byte s = 10;
        byte v = 30;
        int result = s * v;
        System.out.println(result);


    }
}
