import java.util.Scanner;

public class SettingFlightBooking {
    public static void main(String[] args) {

        Scanner obScanner           = new Scanner(System.in);
        FlightBooking flightBooking = new FlightBooking();
        TwoLines twoLines = new TwoLines();
        ChooseClass chooseClass = new ChooseClass();
        boolean luggagePresence;

        System.out.println("Enter the passengers name: ");
        String name = obScanner.nextLine();

        System.out.println("Choose the destination: ");
        System.out.println("1. Paris");
        System.out.println("2. Roma");
        System.out.println("3. Londra");
        System.out.println("4. Barcelona");
        System.out.println("Enter the destination name: ");

        int destChoice = obScanner.nextInt();
        obScanner.nextLine();

        String destination = "";

        switch (destChoice) {
            case 1:
                destination = "Paris";
                break;
            case 2:
                destination = "Roma";
                break;
            case 3:
                destination = "Londra";
                break;
            case 4:
                destination = "Barcelona";
                break;
            default:
                System.out.println("Optiune invalida!");
                destination = "Necunoscut";
                break;
        }
        System.out.println("Alegeti compania de zbor: ");
        System.out.println("1. WizzAir");
        System.out.println("2. Ryanair");
        System.out.println("3. TurkishAirlines");
        System.out.println("4. HiSky");
        System.out.print("Introduceti numarul companiei: ");

        int bestCompany = obScanner.nextInt();
        obScanner.nextLine();

        String company = "";
        switch (bestCompany) {
            case 1:
                company = "Wizzair";
                break;
            case 2:
                company = "Ryanair";
                break;
            case 3:
                company = "TurkishAirlines";
                break;
            case 4:
                company = "HiSky";
                break;
            default:
                System.out.println("Optiune invalida!");
                company = "Necunoscut";
                break;
        }

        twoLines.printLine();

        System.out.print("Do you have luggage?(true/false): ");
        while (true) {
            if (obScanner.hasNextBoolean()) {
                luggagePresence = obScanner.nextBoolean();
                break;
            } else {
                System.out.print("Please enter true or false: ");
                obScanner.next();
            }
        }

        System.out.println("Choose your class Business or Economy");
        String classType = obScanner.next().replace(" ", "");
        chooseClass.settingClass(classType.toLowerCase());
        classType = chooseClass.finalClass;
        twoLines.printLine();

        flightBooking.setPassengerName(name);
        flightBooking.setDestination(destination);
        flightBooking.setAirline(company);
        flightBooking.setSeatClass(classType);
        flightBooking.setHasLuggage(luggagePresence);

        System.out.println("Final booking: ");
        System.out.println("Passenger: " + flightBooking.getPassengerName());
        System.out.println("Destination: " + flightBooking.getDestination());
        System.out.println("Airline: " + flightBooking.getAirline());
        System.out.println("Class: " + flightBooking.getSeatClass());
        System.out.println("Checked baggage: " + flightBooking.isHasLuggage());

        obScanner.close();

    }
}