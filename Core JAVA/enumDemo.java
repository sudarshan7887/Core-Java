//java extends the enum class

enum status{
    running,pending,failed ,success;
}
public class enumDemo {
    public static void main(String[] args) {
        status[] s = status.values();

        //print all status
        for(status st :s)
        {
            System.out.println(st.ordinal()+":"+st);
            //ordinal method is used to print the index in enum
        }

        //status in if else
      status s1 = status.success;
        System.out.print("Status is:");
        if(s1 ==status.running) {
            System.out.println("Running the status");
        }
        else if (s1==status.pending) {
            System.out.println("status is pending");
        }
        else if (s1==status.failed) {
            System.out.println("status failed please try again!");
        }
        else {
            System.out.println("Done");
        }


        //Switch case
        System.out.println("using switch case:");

        switch (s1){
            case failed :
                System.out.println("Status is failed!");
                break;
            case pending:
                System.out.println("Status is pending");
                break;
            case running:
                System.out.println("status is running!");
                break;
            default:
                System.out.println("status is Done");
        }
    }
}
