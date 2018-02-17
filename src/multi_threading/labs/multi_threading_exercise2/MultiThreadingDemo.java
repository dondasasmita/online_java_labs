package multi_threading.labs.multi_threading_exercise2;

public class MultiThreadingDemo {

    public static void main(String[] args) {

        SelamatDatang greeting1 = new SelamatDatang();
        Welcome greeting2 = new Welcome();

        greeting1.setPriority(1);
        greeting2.setPriority(3);

        greeting1.start(); // object is calling a method from Thread class because Selamat Datang extends Thread
        greeting1.getPriority();
        greeting2.getPriority();
        greeting2.start();// object is calling a method from Thread class because Welcome extends Thread

    }
}
