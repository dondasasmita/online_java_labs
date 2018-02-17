package multi_threading.labs.multi_threading_exercise1;

public class MultiplyDemo {

    public static void main(String[] args) {

        MultiplyBy2 times2 = new MultiplyBy2();
        MultiplyBy3 times3 = new MultiplyBy3();

        Thread object1 = new Thread(times2);// passing the object of Runnable because MultiplyBy2 Class implements Runnable interface
        Thread object2 = new Thread(times3);// passing the object of Runnable because MultiplyBy3 Class implements Runnable interface

        object1.start();// object is calling a method from Thread class
        object2.start();// object is calling a method from Thread class

    }
}
