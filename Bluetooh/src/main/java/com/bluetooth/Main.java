package com.bluetooth;

import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;

/**
 * Created by jrodriguez on 20/04/16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            LocalDevice.getLocalDevice();

            DiscoveryAgent da = LocalDevice.getLocalDevice().getDiscoveryAgent();
            RemoteDevice[] remote = da.retrieveDevices(DiscoveryAgent.NOT_DISCOVERABLE);
            System.out.println("Termine");

        } catch (BluetoothStateException e) {
            e.printStackTrace();
        }
    }
}
