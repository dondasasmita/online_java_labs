package multi_threading.labs.multi_threading_exercise2;

public class Welcome extends Thread{

    //the method is named run which will be automatically called by the Class Thread
    public void run() {

        for (int i = 0 ; i <= 5 ; i++) {
            System.out.print("Welcome | ");
            try { Thread.sleep(300);} //delayed 0.3 seconds
                catch (Exception e) {
                    e.printStackTrace();
                }
        }

    }

}
