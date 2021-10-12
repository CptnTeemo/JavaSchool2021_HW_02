package ru.dataart.academy.java.figures;

public class Calculator {

    public double getSumAreas(Figure[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getArea();
        }
        return (double) Math.round(sum * 100) / 100;
    }
}
