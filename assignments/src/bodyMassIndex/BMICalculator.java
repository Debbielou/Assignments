package bodyMassIndex;

//Requirements:
//Input: The program should prompt the user to enter their height in centimeters and weight in kilograms.
//BMI Calculation: The program should include a method to calculate BMI using the formula:

import java.util.Scanner;

public class BMICalculator {
	
	double weight;
	double height;
		
	public static double convertCentemetersToMetersSquared(double cms) {
		double heightInMeters = cms / 100;
		double metersSquared = heightInMeters * heightInMeters;
		return metersSquared;
	}
	public static double calculateBodyMassIndex(double kgs, double centimeters) {
		double bmi = kgs/ convertCentemetersToMetersSquared(centimeters);
		String formattedBmi = String.format("%.2f", bmi);
		System.out.println("Your BMI is: " + formattedBmi);
	    return bmi;
	}
	
	public static String determineBMICategory(double bmi) {
		if(bmi < 18.5) {
        	System.out.println("You are underweight.");
        } else if(bmi >=18.5 && bmi < 24.9) {
        	System.out.println("Your weight is normal.");
        } else if(bmi >= 25 && bmi < 29.9) {
        	System.out.println("You are overweight.");
        } else if(bmi > 30){
        	System.out.println("You are obese.");
        } else {
        	System.out.println("You are un measured.");
        }
		return null;
	}

	public static void main(String[] args) {
		
		Scanner triage = new Scanner(System.in);
		System.out.println("Enter your weight.");
        double weight = triage.nextDouble();
        System.out.println("Enter your height.");
        double height = triage.nextDouble();
        double bmi = calculateBodyMassIndex(weight, height);
        System.out.println(bmi);
        determineBMICategory(bmi);
        triage.close();

	}
	

    		 
  }



