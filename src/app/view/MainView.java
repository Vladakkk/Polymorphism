package app.view;

import java.util.Scanner;

public class MainView {

    static Scanner sc = new Scanner(System.in);

    public double getNum1() {
        System.out.print("Enter first number: ");
        return sc.nextDouble();
    }

    public double getNum2(){
        System.out.print("Enter second number: ");
        return sc.nextDouble();
    }

    public void getOutput(String output){
        sc.close();
        System.out.println(output);
    }
}
