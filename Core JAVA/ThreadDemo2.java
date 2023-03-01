public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        //Annonymous class

//        Runnable obj1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//                try {
//                    Thread.sleep(5);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        Runnable obj2 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0;i<5;i++) {
//                    System.out.println("Sudarshan");
//                }
//                try {
//                    Thread.sleep(5);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };

        //lambda Expression using runnable

        Runnable obj1 = () -> {
            for (int i=0;i<5;i++) {
                System.out.println("Hello");
            }
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);

            }
        };
        Runnable obj2 = () -> {
            for (int i=0;i<5;i++) {
                System.out.println("Sudarshan");
            }
                try {
                    Thread.sleep(6);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        };

        obj1.run();
        Thread.sleep(5);
        obj2.run();
    }
}
