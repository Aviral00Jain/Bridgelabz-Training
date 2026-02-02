package com.lambdaexpression.smarthomelight;

class SmartLightController {

	public void activateLight(LightAction action) {
		action.execute();
	}
}