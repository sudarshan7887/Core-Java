
class calculator{

    //methods overloading=>different methods for same method name with different paramenters
    public int add(int n1,int n2){
        return n1 +n2;
    }
    public int add(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1,double n2){
        return n1 +n2 ;
    }
}

public class methods_overloading {
    public static void main(String[] args) {
        calculator obj = new calculator();
        int result = obj.add(12,32);
        System.out.println(result);
    }
}
