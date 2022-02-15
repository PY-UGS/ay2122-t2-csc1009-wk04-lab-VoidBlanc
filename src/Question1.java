import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds:  ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches:  ");
        double height = input.nextDouble();

        BMI bmi = new BMI(weight, height);
        System.out.println("BMI is " + bmi.calculateBMI());
        System.out.println(bmi.interpretBMI());
    }
}
