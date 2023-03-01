
class Annony{

    public Annony(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("In Show");
    }

}
public class AnnonymousObj
{
    public static void main(String[] args) {
        new Annony().show();        //Annonymous object
    }
}
