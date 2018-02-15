package packages_interfaces.labs.PersonalDevice;

public class Laptop implements PersonalDevice {


    @Override
    public int turnOn(int x, int y) {
        int z = x - y;
        System.out.println(z);
        return z;
    }

    @Override
    public int batteryInfo() {
        System.out.println();
        return 0;
    }

    @Override
    public String turnOff() {
        System.out.println("Thank you.");
        return null;
    }

    public static void main(String[] args) {

        int macbattery = 100;


        Laptop macbook = new Laptop();
        macbook.turnOn(macbattery,10);
        macbook.turnOff();


    }


}
