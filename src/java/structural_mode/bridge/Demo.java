package structural_mode.bridge;

import structural_mode.bridge.devices.Device;
import structural_mode.bridge.devices.Radio;
import structural_mode.bridge.devices.Tv;
import structural_mode.bridge.remotes.AdvancedRemote;
import structural_mode.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
//        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
