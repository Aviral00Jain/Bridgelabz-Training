package com.objectandclass.level1;

public class Circle {
	
	//non static variable
    double radius;
    
    //constructor
    Circle(double radius ){
    	this.radius=radius;
    }
    
    // creating method for calculating area of circle 
    public void areaCircle() {
    	System.out.printf("Area of circle: %.4f",(Math.PI*radius*radius));
    }
    
    //creating method to calculate circumference of circle 
    public void circumferenceCircle() {
		System.out.printf("\nCircumference of circle: %.4f ",(2*Math.PI*radius));

    }
    
    
    public static void main(String [] args) {
    	Circle circle1 = new Circle(2.5);
    	circle1.areaCircle();
    	circle1.circumferenceCircle();
    }
    
    
    
}