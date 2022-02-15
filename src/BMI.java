public class BMI {
    private double weight;
    private double height;
    //Kilo and Meter conversion values
    private static final double KILO_CONVERT = 0.45359237;
    private static final double METER_CONVERT = 0.0254;
    public BMI() {
        this.weight = 0.0;
        this.height = 0.0;
    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateBMI(){return ((this.weight * KILO_CONVERT) / Math.pow(this.height * METER_CONVERT, 2));}

    public String interpretBMI(){
        double bmi = calculateBMI();
        if(bmi < 18.5){
            return "Underweight";
        }else if(bmi >= 18.5 && bmi < 25.0){
            return "Normal";
        }else if (bmi >= 25.0 && bmi < 30.0){
            return "Overweight";
        }else{
            return "Obese";
        }
    }
}
