package com.shefzee.patterns.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        msi.createGpu();
        msi.createMonitor();

        Company asus = new AsusManufacturer();
        asus.createMonitor();
        asus.createGpu();
    }
}
