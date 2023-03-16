package prog2.exercise5.flight.booking.system;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the number of tickets: ");
        int number = scanner.nextInt();
     
        FlightBooking flightbooking = new FlightBooking(number);
       flightbooking.reserveTickets(number);
       flightbooking.displayTripDetails(number);
       scanner.close();

    }

}