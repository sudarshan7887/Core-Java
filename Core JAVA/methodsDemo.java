
class methods
{
    public void  music()
    {
        System.out.println("playing music...");
    }
    public String pen(int cost)
    {
        if(cost <50)
            return "I can buy this pen";
        else
            return "I can't buy this pen";
    }
}
public class methodsDemo {
    public static void main(String[] args) {

        methods md = new methods();

        md.music();             //call music method because its datatype is void

        String str = md.pen(50);    // call pen method its datatype is String
        System.out.println(str);
    }
}
