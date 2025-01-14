import java.util.Scanner;

public class Lv02_Problem08_TravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the traveler: ");
        String name = input.nextLine();

        System.out.print("Enter the city of origin: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in km: ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in hours: ");
        int hoursFromToVia = input.nextInt();

        System.out.print("Enter the minutes taken from " + fromCity + " to " + viaCity + ": ");
        int minutesFromToVia = input.nextInt();

        int timeFromToVia = hoursFromToVia * 60 + minutesFromToVia;

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in km: ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in hours: ");
        int hoursViaToFinalCity = input.nextInt();

        System.out.print("Enter the minutes taken from " + viaCity + " to " + toCity + ": ");
        int minutesViaToFinalCity = input.nextInt();

        int timeViaToFinalCity = hoursViaToFinalCity * 60 + minutesViaToFinalCity;

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is " +
                totalTime + " minutes");

        input.close();
    }
}

