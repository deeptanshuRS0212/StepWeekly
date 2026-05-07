import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double distanceInKilometers = input.nextDouble();

        double metersPerKilometer = 1000.0;
        double centimetersPerMeter = 100.0;

        double distanceInMeters = distanceInKilometers * metersPerKilometer;
        double distanceInCentimeters = distanceInMeters * centimetersPerMeter;

        System.out.println("Distance in meters = " + distanceInMeters);
        System.out.println("Distance in centimeters = " + distanceInCentimeters);
        input.close();
    }
}
