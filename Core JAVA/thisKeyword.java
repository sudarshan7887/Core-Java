
//this keyword is used to represent current object

class person {
    private int pid;
    private String name;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {

        this.pid =pid;
    }

    public String getName(){
        return name;
    }
    public void setName(String name)        
    {
        this.name = name;
    }
}
public class thisKeyword
{
    public static void main(String[] args) {
        person p = new person();
        p.setPid(12);
        p.setName("ram");

        System.out.println(p.getPid()+":"+p.getName());
    }
}
