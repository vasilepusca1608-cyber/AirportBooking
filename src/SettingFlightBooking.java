import java.util.Scanner;

public class SettingFlightBooking {
    public static void main(String[] args) {

        Scanner obScanner           = new Scanner(System.in);
        FlightBooking flightBooking = new FlightBooking();

        System.out.println("Introduceti numele pasagerului: ");
        String name = obScanner.nextLine();

        System.out.println("Alegeti destinatia: ");
        System.out.println("1. Paris");
        System.out.println("2. Roma");
        System.out.println("3. Londra");
        System.out.println("4. Barcelona");
        System.out.println("Introduceti numarul destinatiei: ");

        int destChoice = obScanner.nextInt();
        obScanner.nextLine(); // consumăm linia

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

        String airline = "Air Moldova";
        String seatClass = "Economy";
        boolean hasLuggage = false;

        // CREAM OBIECTUL AICI!

        obScanner.close();

        // TEST: afișăm rezervarea
        System.out.println("\n--- Rezervare Creata ---");
        System.out.println("Nume: " + flightBooking.getPassengerName());
        System.out.println("Destinatie: " + flightBooking.getDestination());


        obScanner.close();


    }
}