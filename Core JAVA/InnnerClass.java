class l{
    public void show(){
        System.out.println("in class l");
    }

//    class m
    static class m {
        public void config(){
            System.out.println("In Inner class");
        }
    }
}
public class InnnerClass
{
    public static void main(String[] args) {

        l obj1 = new l();
        obj1.show();

//        l.m obj2 = obj1.new m();      if inner class not static then use it

      l.m obj = new l.m();          //It is only possible for inner class is static
      obj.config();
    }
}
