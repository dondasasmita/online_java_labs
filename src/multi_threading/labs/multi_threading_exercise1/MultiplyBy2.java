package multi_threading.labs.multi_threading_exercise1;

public class MultiplyBy2 implements Runnable {

    //the method is called run which will be automatically called by the Class Thread
    public void run() {
        int [] array = {1,2,3,4,5};

        for (int i = 0 ; i < array.length ; i++) {
            System.out.println("This is multiply by 2 | " + array[i] * 2 + " | ");
            try {Thread.sleep(300);} catch (Exception e) {};

        }
    }
}
