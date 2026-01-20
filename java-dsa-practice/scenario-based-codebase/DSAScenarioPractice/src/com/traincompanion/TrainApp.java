package com.traincompanion;

public class TrainApp {
	
	public static void main(String [] args) {
		
		TrainTraverse train = new TrainTraverse();
		train.addCompartment(1, "Sleeper");
        train.addCompartment(2, "WiFi");
        train.addCompartment(3, "Pantry");
        train.addCompartment(4, "AC");

        train.displayCurrent();

        train.moveNext();
        train.moveNext();
        train.movePrevious();

        train.removeCompartment(4);

        train.moveNext();
	}

}