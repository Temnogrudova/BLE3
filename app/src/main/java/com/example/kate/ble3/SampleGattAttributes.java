package com.example.kate.ble3;

import java.util.HashMap;

/**
 * Created by 123 on 19.03.2015.
 */
public class SampleGattAttributes {

    private static HashMap<String, String> attributes = new HashMap();
    public static String AMBER_NAME = "00002a24-0000-1000-8000-00805f9b34fb";//"2a24";
    public static String AMBER_FUSION = "fd39a007-04c5-7f11-e4bf-ec0002a5c51b";//"2a24";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    static {
        // Sample Services.
       // attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        //attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(AMBER_NAME, "AMBER_NAME");
        attributes.put(AMBER_FUSION , "AMBER_FUSION ");
       // attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
    }
    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
