package prog2.exercise5.flight.booking.system;


import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


public class FlightBooking {
    enum BookingClass{FIRST,BUSINESS,ECONOMY }
    enum TripType{ONE_WAY,RETURN}
    enum TripSource{BEIJING, SHANGHAI, OULU, NANJING, PARIS,HELSINKI}
    enum TripDestination{BEIJING, SHANGHAI, OULU, NANJING, PARIS,HELSINKI}
    enum SourceAirport{NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
                       SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT,
                       PARIS_CHARLES_DE_GAULLE_AIRPORT}
    enum Destinationairport{NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
                            SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT,
                            PARIS_CHARLES_DE_GAULLE_AIRPORT}
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;
    private String[] passengerFullName;
    private String[] passengerGender;
    private int[] passengerAge;
    private String[] ticketNumber;
    private String flightID;
    private String classification;
    private final String flightCompany = "Flights-of-Fancy";
    private TripSource tripSource ;
    private SourceAirport sourceAirport ;
    private TripDestination tripDestination;
    private Destinationairport destinationAirport;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private BookingClass bookingClass;
    private TripType tripType;
    private Destinationairport destinationairport;
    boolean TF=false;


    public FlightBooking (int number){
        this.passengerFullName = new String[number];
        this.passengerGender = new String[number];
        this.passengerAge = new int[number];
        this.ticketNumber = new String[number];
    }
    public BookingClass getBookingClass(){
        return bookingClass;
    }

    public void setBookingClass(String bookingClass){
        switch (bookingClass){
            case "1":
                this.bookingClass = BookingClass.FIRST;
                break;
            case "2":
                this.bookingClass = BookingClass.BUSINESS;
                break;
            case "3":
                this.bookingClass = BookingClass.ECONOMY;
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
    public void setTripType(String tripType){
        switch (tripType) {
            case "1":
                this.tripType = TripType.ONE_WAY;
                break;
            case "2":
                this.tripType = TripType.RETURN;
                break;
            default:
                System.out.println("Error");
        }
    }

    public void setTripSource(String tripSource)
    {
        switch (tripSource){
            case "1":
                this.tripSource = TripSource.NANJING;
                this.sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
            case "2":
                this.tripSource = TripSource.BEIJING;
                this.sourceAirport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
            case "3":
                this.tripSource = TripSource.OULU;
                this.sourceAirport = SourceAirport.OULU_AIRPORT;
                return;
            case "4":
                this.tripSource = TripSource.HELSINKI;
                this.sourceAirport = SourceAirport.HELSINKI_AIRPORT;
                break;
            default:
                System.out.println("Error");
        }
    }

    public void setSourceAirport(String sourceAirport)
    {
        switch (sourceAirport){
            case "1":
                this.tripSource = TripSource.NANJING;
                this.sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
            case "2":
                this.tripSource = TripSource.BEIJING;
                this.sourceAirport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
            case "3":
                this.tripSource = TripSource.OULU;
                this.sourceAirport = SourceAirport.OULU_AIRPORT;
                return;
            case "4":
                this.tripSource = TripSource.HELSINKI;
                this.sourceAirport = SourceAirport.HELSINKI_AIRPORT;
                break;
            default:
                System.out.println("Error");
        }
    }

    public void setDestinationAirport(String sourceAirport, String destinationAirport)
    {
        switch (destinationAirport){
            case "1":
                this.tripSource = TripSource.NANJING;
                this.sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
            case "2":
                this.tripSource = TripSource.BEIJING;
                this.sourceAirport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
            case "3":
                this.tripSource = TripSource.OULU;
                this.sourceAirport = SourceAirport.OULU_AIRPORT;
                return;
            case "4":
                this.tripSource = TripSource.HELSINKI;
                this.sourceAirport = SourceAirport.HELSINKI_AIRPORT;
                break;
            default:
                System.out.println("Error");
        }
    }

    public String getPassengerFullName(int index)
    {
        return passengerFullName[index];
    }
    public void setPassengerFullName(int index, String Fullname)
    {
        passengerFullName[index] = Fullname;
    }

    public String getPassengerGender(int index)
    {
        return passengerGender[index];
    }

    public void setPassengerGender(int index, String Gender)
    {
        passengerGender[index] = Gender;
    }

    public int getPassengerAge(int index)
    {
        return passengerAge[index];
    }

    public void setPassengerAge(int index, int Age)
    {
        passengerAge[index] = Age;
    }




    public void setDepartingTicketPrice(int childPassengers,int adultPassengers)
    {
        setClassification(tripSource.toString(),tripDestination.toString());
        switch (bookingClass) {
            case FIRST:
                if (classification.equals("domestic"))
                    this.departingTicketPrice = (childPassengers+adultPassengers) *345 +250;
                else
                    this.departingTicketPrice = (childPassengers+adultPassengers) *375 +250;
                break;
            case BUSINESS:
                if (classification.equals("domestic"))
                    this.departingTicketPrice = (childPassengers+adultPassengers) *345 +150;
                else
                    this.departingTicketPrice = (childPassengers+adultPassengers) *375 +150;
                break;
            case ECONOMY:
                if (classification.equals("domestic"))
                    this.departingTicketPrice = (childPassengers+adultPassengers) *345 +50;
                else
                    this.departingTicketPrice = (childPassengers+adultPassengers) *375 +50;
            default:
                break;
        }

    }

    public void setClassification(String _source,String _destination)
    {
      String x = _source +  _destination;
      if (x.equals("NANJINGBEIJING")||x.equals("BEIJINGNANJING")||x.equals("OULUHELSINKI")||x.equals("HELSINKIOULU"))
      {
         this.classification = "domestic";
      }
      else
          this.classification = "international";
    }
    public void setTripDestination(String tripSource,String tripDestination)
    {
        switch (tripDestination){
            case "1":
                this.tripDestination = TripDestination.NANJING;
                this.destinationairport = Destinationairport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
            case "2":
                this.tripDestination = TripDestination.BEIJING;
                this.destinationairport = Destinationairport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
            case "3":
                this.tripDestination = TripDestination.OULU;
                this.destinationairport = Destinationairport.OULU_AIRPORT;
                break;
            case "4":
                this.tripDestination = TripDestination.HELSINKI;
                this.destinationairport = Destinationairport.HELSINKI_AIRPORT;
                break;
            default:
                System.out.println("Error");
        }
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public void setReturnDate(LocalDate returnDate){
        this.returnDate = returnDate;
            Period p = Period.between(departureDate,returnDate);
            if (p.getDays() < 2 && p.getMonths() <=0 &&p.getYears()<=0) {
                this.returnDate = departureDate.plusDays(2);
                this.TF = true;
            } else
                this.returnDate = returnDate;

    }

    public String getFlightCompany()
    {
        return flightCompany;
    }
    public TripSource getTripSource()
    {
        return tripSource;
    }
    public TripDestination getTripDestination()
    {
        return tripDestination;
    }

    public LocalDate getDepartureDate(){
        return departureDate;
    }

    public LocalDate getReturnDate(){
        return returnDate;
    }


    public int getChildPassengers(){
        return childPassengers;
    }

    public int getAdultPassengers(){
        return adultPassengers;
    }

    public int getTotalPassengers()
    {
        return totalPassengers;
    }
    public void setTotalPassengers(int childPassengers,int adultPassengers){
        totalPassengers = childPassengers + adultPassengers;
    }

    public double getDepartingTicketPrice()
    {
        return departingTicketPrice;
    }

    public double getReturnTicketPrice()
    {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice(){
        switch (tripType){
            case ONE_WAY:
                this.returnTicketPrice = 0;
                break;
            case RETURN:
                this.returnTicketPrice = departingTicketPrice;
                break;
            default:
                break;
        }
    }
    public double getTotalTicketPrice()
    {
        return totalTicketPrice;
    }
    public void setTotalTicketPrice(){
        totalTicketPrice = departingTicketPrice + returnTicketPrice;
    }
    public String getTicketNumber(int index)
    {
        return ticketNumber[index];
    }
    public void setTicketNumber(int index)
    {   setClassification(tripSource.toString(),tripDestination.toString());
        Random rnd = new Random();
        int number = rnd.nextInt(9000)+1000;
        String m = String.valueOf(number);
        switch (bookingClass){
            case FIRST:
                if (tripType.equals(TripType.ONE_WAY))
                {
                    if (classification.equals("domestic"))
                        this.ticketNumber[index] = "11" + "F" + m + "DOM";
                    else
                        this.ticketNumber[index] = "11" + "F" + m + "INT";
                }
                else{
                    if (classification.equals("domestic"))
                        this.ticketNumber[index] = "22" + "F" + m + "DOM";
                    else
                        this.ticketNumber[index] = "22" + "F" + m + "INT";
                }
                break;
            case BUSINESS:
                if (tripType.equals(TripType.ONE_WAY))
                {
                    if (classification.equals("international"))
                        this.ticketNumber[index] = "11" + "B" + m + "DOM";
                    else
                        this.ticketNumber[index] = "11" + "B" + m + "INT";
                }
                else{
                    if (classification.equals("domestic"))
                        this.ticketNumber[index] = "22" + "B" + m + "DOM";
                    else
                        this.ticketNumber[index] = "22" + "B" + m + "INT";
                }
                break;
            case ECONOMY:
                if (tripType.equals(TripType.ONE_WAY))
                {
                    if (classification.equals("international"))
                        this.ticketNumber[index] = "11" + "E" + m + "DOM";
                    else
                        this.ticketNumber[index]= "11" + "E" + m + "INT";
                }
                else{
                    if (classification.equals("domestic"))
                        this.ticketNumber[index] = "22" + "E" + m + "DOM";
                    else
                        this.ticketNumber[index] = "22" + "E" + m + "INT";
                }
                break;
            default:
                break;
        }
    }

    public void reserveTickets(int number) {
        Scanner scanner = new Scanner(System.in);
        String FullName;
        String Gender;
        int Age;
        for (int i = 0; i < number;++i) {
            System.out.println("Enter full name for passenger " + (i+1) + ":");
             FullName = scanner.nextLine();
            setPassengerFullName(i, FullName);
            
            System.out.println("Enter gender (M/F) for passenger " + (i+1) + ":");
             Gender = scanner.nextLine();
            setPassengerGender(i, Gender);
            
            System.out.println("Enter age for passenger " + (i+1) + ":");
             Age = scanner.nextInt();
            setPassengerAge(i, Age);
            

        }

            System.out.println("Please choose the class of travel (Enter 1 for First, 2 for Business, 3 for Economy) :");
            String choice1 = scanner.next();
            setBookingClass(choice1);
    
            System.out.println("Please choose the trip type(Enter 1 for One way, 2 for Return) for passenger :");
            String choice2 = scanner.next();
            setTripType(choice2);
    
            System.out.println("Please choose the trip source(Enter 1 for Nanjing, 2 for Beijing, 3 for Oulu, 4 for Helsinki for passenger :");
            String source = scanner.next();
            setTripSource(source);
    
            System.out.println("Please choose the trip destination(Enter 1 for Nanjing, 2 for Beijing, 3 for Oulu, 4 for Helsinki for passenger :");
            String destination = scanner.next();
            setTripDestination(source, destination);
            
            System.out.println("Please select the date of departure(like 2023-03-07)");
            String departure1 = scanner.next();
            LocalDate departure = LocalDate.parse(departure1);
            setDepartureDate(departure);

            System.out.println("Please select the date of return(like 2023-03-07)");
            String return2 = scanner.next();
            LocalDate return1 = LocalDate.parse(return2);
           setReturnDate(return1);

            System.out.println("Please enter the number of children");
            int child = scanner.nextInt();
    
            System.out.println("Please enter the number of adults");
            int adults = scanner.nextInt();
            for(int m=0;m<number;++m){
           setTicketNumber(m);
            }
            
         
            setTotalPassengers(child, adults);
            setClassification(source, destination);
            setDepartingTicketPrice( childPassengers, adultPassengers);
            setReturnTicketPrice();
            setTotalTicketPrice();
           

          scanner.close();
                 
            }

    public String toString()
    {   setDepartingTicketPrice( childPassengers, adultPassengers);
        setReturnTicketPrice();
        setTotalTicketPrice();
        setDepartureDate(departureDate);
        setReturnDate(returnDate);
        String T = "Thank you for booking your flight with "+ flightCompany+". Following are the details \nof your booking and the trip: \n\nTicket Number:"
                +ticketNumber+"\nPassenger Name: "+ passengerFullName+"\nFrom " +tripSource+ " to "+tripDestination +"\nDate of departure: "+departureDate+"\nDate of return: "+returnDate+"(Changed from old returningDate to new returningDate)\nTotal passengers:"+
                totalPassengers+"\nTotal ticket price in Euros: "+totalTicketPrice;

        String F = "Thank you for booking your flight with "+ flightCompany+". Following are the details \nof your booking and the trip: \n\nTicket Number:"
                +ticketNumber+"\nFrom " +tripSource+ " to "+tripDestination +"\nDate of departure: "+departureDate+"\nDate of return: "+returnDate+"(Changed from old returningDate to new returningDate)\nTotal passengers:"+
                totalPassengers+"\nTotal ticket price in Euros: "+totalTicketPrice+"\nIMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                "less than two days apart from your departure date.";
        if (TF)
        {
            return F;
        }

            return T;

    }

    public void displayTripDetails(int number){
        if(TF){
        System.out.println("Thank you for booking your flights with FLIGHT_COMPANY"+"\nYou reserved a total of " + number +" tickets.");
        for(int j=0;j<number;j++){
            System.out.println("Here are the trip details for Passenger NO. " + j +"\nPassenger's Ticket Number: "+ ticketNumber[j]+"\nPassenger's Full Name: " + passengerFullName[j] +"\nPassenger's Age: "+passengerAge[j]+"\nPassenger's Gender: "+passengerGender[j]
             +"\nFrom: "+ tripSource + "(" + sourceAirport +")" + "\nto " +tripDestination+"("+destinationairport+")"+"\nThe flight departs on: " +departureDate+"\nAnd the return flight is on " + returnDate+" (Changed from old returningDates to new returningDates)");
             System.out.println("The total ticket price is: "+ totalTicketPrice +"\n\n");
             System.out.println("IMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date.");
            }
    } else
    System.out.println("Thank you for booking your flights with FLIGHT_COMPANY"+"\nYou reserved a total of " + number +" tickets.");
        for(int j=0;j<number;j++){
            System.out.println("Here are the trip details for Passenger NO. " + j +"\nPassenger's Ticket Number: "+ ticketNumber[j]+"\nPassenger's Full Name: " + passengerFullName[j] +"\nPassenger's Age: "+passengerAge[j]+"\nPassenger's Gender: "+passengerGender[j]
             +"\nFrom: "+ tripSource + "(" + sourceAirport +")" + "\nto " +tripDestination+"("+destinationairport+")"+"\nThe flight departs on: " +departureDate+"\nAnd the return flight is on " + returnDate);
             System.out.println("The total ticket price is: "+ totalTicketPrice +"\n\n");
            }  
    }

}


