package com.lambdaexpression.smarthomelight;

public class SmartHomeLighting {
	public static void main(String[] args) {

		SmartLightController controller = new SmartLightController();

		// Motion detected
		controller.activateLight(() -> System.out.println("Motion detected: Turning ON white lights"));

		// Night time
		controller.activateLight(() -> System.out.println("Night time: Dimming lights to 30%"));

		// Voice command
		controller.activateLight(() -> System.out.println("Voice command received: Changing lights to BLUE"));
	}
}