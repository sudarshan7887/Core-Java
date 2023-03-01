
abstract class a1{
    public abstract void modify();
    public abstract void config();
}

public class Abstract_AnnonymousInnerClass {
    public static void main(String[] args) {
    a1 obj = new a1() {

        public void modify() {
            System.out.println("In modify method");
        }

        public void config() {
            System.out.println("In config method");
        }
    };
    obj.config();
    obj.modify();
    }
}
