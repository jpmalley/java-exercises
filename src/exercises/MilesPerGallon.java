package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        miles = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("How many gallons of gas did you consume?");
        gallons = in.nextDouble();

        mpg = miles / gallons;
        System.out.println("Your MPG is: " + mpg);
    }

}
