package BMI.spring.beans;

public class BMI implements IBMI{

    private double h;
    private double w;
    private double bmi;
    
    @Override
    public double getBMI() {
        return bmi;
    }
    
    @Override
    public double setHW(double h, double  w) {
        bmi = w / Math.pow(h/100, 2);
        return getBMI();
    }
}
