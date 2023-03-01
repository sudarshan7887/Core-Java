public class StringDmo
{
    public static void main(String[] args)
    {
        //Strings are immutable can't change
        String name = "Sudarshan";
        System.out.println("name is:"+name);

        //StringBuffer and StringBuilder are same
        System.out.println("using StringBuffer:");
        StringBuffer sb = new StringBuffer("Sudarshan ");
        sb.append("pansare");
        String s = sb.substring(2,5);
        System.out.println(sb);
        System.out.println(s);

        //StringBuilder
        StringBuilder sr = new StringBuilder("Pansare");
        sr.delete(2,5);
        System.out.println(sr);

    }
}
