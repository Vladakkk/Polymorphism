package app.model;

public class DeviceBModel extends DeviceAModel{

    public static final double COEFFICIENT = 3.5;

     public static double calcRes(double numA, double numB){
        return (numA + numB) * COEFFICIENT;
    }
}
