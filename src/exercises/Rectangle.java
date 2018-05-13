package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the length?");
        length = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("What is the width?");
        width = in.nextDouble();

        area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}
