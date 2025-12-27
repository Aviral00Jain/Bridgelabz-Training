import java.util.Scanner;

public class BMIUsing2DArray{
   public static void main(String [] args){
      
	     // creating object of Scanner class 
	     Scanner input = new Scanner(System.in);
		 
		 // taking input from user 
		 System.out.println("Enter number of person");
		 int number = input.nextInt();
		 
		 // creatinf array
		 double [][] personData = new double[number] [3];
		 String [] status = new String[number];
		 
		 //taking input from user
		 for(int i=0;i<number;i++){
		   for(int j=0;j<2;j++){
			   if(j==0){
				   System.out.println("Enter weight");
			   }
			   else {
				   System.out.println("Enter height");
			   }
		         personData[i][j] = input.nextDouble();
				 
				 // validation 
				 if(personData[i][j] <=0) {
				 System.out.println("Invalid input");
				    }
				 }
			}	 
		   
		   
		  // calculating BMI 
		  for(int i=0;i<number;i++){
              personData[i][2]= personData[i][0]/ (personData[i][1] * personData[i][1]);
           			}
			
			// declaring status
			for(int i=0;i<number;i++){
				if (personData[i][2] <= 18.4) {
                status[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
                }
		    }	
		  //displaying results
		  for(int i = 0 ; i < number ; i++ ){
		      System.out.println("person " + (i+1));
			    System.out.println("weight = " + personData[i][0]);
			    System.out.println("height = " + personData[i][1]);
			    System.out.println("BMI = " + personData[i][2]);
				}
		  }
	}	  