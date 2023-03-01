//set does not print a duplicate value
//set does not have a index value
//hashset does not work with sequence

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        //HashSet
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(50);
        s.add(20);
        s.add(80);
        s.add(50);          //does not print duplicate value

        for(int i:s)
            System.out.println(i);

        //TreeSet
        System.out.println("TreeSet:=>");
        Set<Integer> t1 = new TreeSet<>();  //TreeSet print the value in sorted format i.e asending
        t1.add(10);
        t1.add(100);
        t1.add(20);
        t1.add(5);
        t1.add(80);

        for (int i:t1)
            System.out.println(i);

        //Iterator
        System.out.println("Using iterator:=>");
        Iterator<Integer> It = t1.iterator();

        while (It.hasNext())
            System.out.println(It.next());
        }
    }
