import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,Integer> m = new HashMap<>();
        m.put("Sudarshan",1);
        m.put("Ganesh",2);
        m.put("Kiran",3);
        m.put("suhas",4);
        m.put("pratik",5);

        System.out.println(m.keySet());     //print all the keys
        System.out.println(m.values());     //print all the values i.e 1,2,3,4,5

        for(String key : m.keySet())
            System.out.println(key+":"+m.get(key));
    }
}
