package multi_threading.labs.multi_threading_exercise1;

public class MultiplyBy3 implements Runnable {

    //the method is named run which will be automatically called by the Class Thread
    public void run() {

        int [] array = {1,2,3,4,5};
        for (int i = 0 ; i < array.length ; i++) {
            System.out.println("This is multiply by 3 | "+ array[i] * 3 + " | ");
            try {Thread.sleep(300);} catch (Exception e) {};
        }
    }
}
