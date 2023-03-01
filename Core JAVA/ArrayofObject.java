class students{
    int rno;
    String name;
    int marks;
}
public class ArrayofObject
{
    public static void main(String[] args)
    {

        students s1 = new students();
        s1.rno = 34;
        s1.name = "sudarshan";
        s1.marks = 78;

        students s2 = new students();
        s2.rno = 54;
        s2.name = "Vinayak";
        s2.marks = 72;

        students s3 = new students();
        s3.rno = 55;
        s3.name = "Abhishek";
        s3.marks = 74;

        students student[] = new students[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

//        for(int i=0;i<student.length;i++)
//        {
//            System.out.println(student[i].name +":"+student[i].marks);
//        }

        //enhanced for loop
        for (students stud :student){
            System.out.println(stud.name +":"+stud.marks);
        }
    }
}
