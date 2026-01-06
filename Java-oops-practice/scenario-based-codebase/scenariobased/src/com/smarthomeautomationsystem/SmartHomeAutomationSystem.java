package com.smarthomeautomationsystem;

public class SmartHomeAutomationSystem {
  
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AC();

        UserController controller = new UserController();

        // Polymorphic control
        controller.operateDevice(light, true);
        controller.operateDevice(fan, true);
        controller.operateDevice(ac, true);

        System.out.println();

        controller.compareUsage(ac, fan);
        controller.compareUsage(light, fan);

        System.out.println();

        controller.operateDevice(ac, false);
    }

   
}
