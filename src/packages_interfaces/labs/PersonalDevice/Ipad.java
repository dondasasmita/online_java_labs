package packages_interfaces.labs.PersonalDevice;

public class Ipad implements PersonalDevice {

    @Override
    public int turnOn(int x, int y) {
        return 0;
    }

    @Override
    public int batteryInfo() {
        return 0;
    }

    @Override
    public String turnOff() {
        return null;
    }
}
