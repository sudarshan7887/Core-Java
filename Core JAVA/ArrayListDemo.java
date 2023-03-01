import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(40);
        list.add(20);
        list.add(70);


        List<String> list1 = new ArrayList<>();
        list1.add("Ram");
        list1.add("shyam");
        list1.add("geeta");
        list1.add("sita");
        list1.add("ganesh");

        //other way to add element in arraylist
        List<Integer> list2 =  Arrays.asList(2,65,7,23,12,87);

        System.out.println("2nd index value is:"+list.get(2));            //get 2nd index number
        System.out.println("index of 70 in given Arraylist is:"+list.indexOf(70));      //print index of 70

        System.out.println("size of list is:"+list.size());

        //print all values one by one
        for (int i:list)
            System.out.println(i);

        for (String i:list1)
            System.out.println(i);

        for(int i :list2)
            System.out.println(i);

        //print arrayList as it is
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);

    }
}
