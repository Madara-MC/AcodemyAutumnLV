package lekcijaCetri;

public class Circle {
    double PI = 3.14;
    public double r;

    double d;

    public double calculateDiameter(){
        return d*2;
    }

    public double calculateArea(){
        return PI * (r*r);
    }
}
