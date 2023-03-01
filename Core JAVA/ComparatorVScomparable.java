import java.util.*;
class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public String toString() {return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
public class ComparatorVScomparable {
    public static void main(String[] args) {

        Comparator<Student>  s = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if(i.age> j.age)
                 return 1;
                else
                    return -1;
            }
        };

       List<Student> studs = new ArrayList<>();
       studs.add(new Student(22,"Sudarshan"));
       studs.add(new Student(11,"kiran"));
       studs.add(new Student(45,"shivam"));
       studs.add(new Student(30,"om"));

        Collections.sort(studs,s);
        for (Student st :studs)
            System.out.println(st);
    }
}
