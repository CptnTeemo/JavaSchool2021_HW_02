package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculator;
import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.print("Task for Java OOP");
        Figure rectangle = new Rectangle(4, 5);
        Figure circle = new Circle(10);
        Figure[] rectanglesArray = {new Rectangle(2, 5), new Rectangle(4, 6),
                new Rectangle(5, 9)};
        Figure[] circlesArray = {new Circle(2), new Circle(3), new Circle(4),
                new Circle(5)};
        Figure[] figuresArray = {rectangle, circle, new Rectangle(3, 5),
                new Circle(14), new Rectangle(6, 3)};
        Calculator calculator = new Calculator();
        System.out.println(System.lineSeparator() +
                "The sum of the areas of the circles is equal to: " + calculator.getSumAreas(circlesArray));
        System.out.println("The sum of the areas of the rectangles is equal to: "
                + calculator.getSumAreas(rectanglesArray));
        System.out.println("The sum of the areas of the figures is equal to: " +
                calculator.getSumAreas(figuresArray));
    }
}