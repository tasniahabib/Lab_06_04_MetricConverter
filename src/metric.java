

import java.util.Scanner;

public class metric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter measurement in meters: ");

        if (!in.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a number.");
            in.close();
            return;
        }

        double meters = in.nextDouble();

        if (meters < 0) {
            System.out.println("Invalid input! Meters cannot be negative.");
        } else {
            double miles = meters / 1609.344;
            double feet = meters * 3.28084;
            double inches = meters * 39.3701;

            System.out.printf("Miles: %.6f%n", miles);
            System.out.printf("Feet: %.2f%n", feet);
            System.out.printf("Inches: %.2f%n", inches);
        }

        in.close();
    }
}