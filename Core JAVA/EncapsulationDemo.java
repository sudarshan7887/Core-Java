class Human {
    private int age;
    private String name;

    //getters and setters method
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age=a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
       name=n;
    }
}
    class EncapsuationDemo{
        public static void main(String[] args)
        {
            Human obj = new Human();
            //set the data
            obj.setAge(23);
            obj.setName("Sudarshan");

            //fetch or get the data
            System.out.println(obj.getAge()+":"+obj.getName());
        }
    }

