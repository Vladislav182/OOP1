package Osnoven;
import java.util.*;

public class BMIcalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        printIntroduction();
    }
    public static void printIntroduction(){
        System.out.println("to calculate your BMI, please input your height, weight and healt status");
        getBMI();
    }
    public static void getBMI() {
        Scanner scan = new Scanner (System.in);
        System.out.println("Input your weight:");
        double weight = scan.nextDouble();
        System.out.println("Input your height");
        double height = scan.nextDouble();
        double weighttopnd = weight * 2.2046;
        double heighttoinch = height * 0.3937;
        double bmi = bmiFor(weighttopnd , heighttoinch);
        System.out.println("Your BMI: " + bmi);
        System.out.println("Your Status : " + getStatus(bmi));
    }
    public static double bmiFor(double a, double b ) {
        double bm1 = a * 703 / (a * b);
        return bm1;
    }
    public static String getStatus(double bmi) {
        String status = "";
        if(bmi <= 18.5) {
            status = "underweight";

        } else if(bmi <= 25) {
            status = "normal";
        } else if(bmi <= 30) {
            status = "overweight";

        } else if(bmi > 30) {
            status = "obese";

        }

        return status;


    }


}

