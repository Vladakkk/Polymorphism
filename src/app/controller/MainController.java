package app.controller;

import app.view.MainView;
import app.model.DeviceAModel;
import app.model.DeviceBModel;
import app.utils.Rounder;

public class MainController {

    MainView view = new MainView();

    public void runApp() {
        double numA = view.getNum1();
        double numB = view.getNum2();
        view.getOutput(formOutput1(getResA(numA, numB)));
        view.getOutput(formOutput2(getResB(numA, numB)));
    }

    public double[] getResA(double numA, double numB) {
        double finalNum = DeviceAModel.calcRes(numA, numB);
        return new double[]{numA, numB, finalNum};
    }

    public double[] getResB(double numA, double numB) {
        double finalNum = DeviceBModel.calcRes(numA, numB);
        return new double[]{numA, numB, finalNum};
    }

    private static String formOutput1(double[] data) {
        return "\nFirst number is: " + data[0] +
                "\nSecond number is: " + data[1] + "\n" +
                "\nFinal number from device A is: " + Rounder.roundValue(data[2]);
    }

    private static String formOutput2(double[] data) {
        return "Final number from device B is: " + Rounder.roundValue(data[2]);

    }
}
