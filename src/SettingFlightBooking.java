import java.util.Scanner;

public class SettingFlightBooking {
    public static void main(String[] args) {

        Scanner obScanner           = new Scanner(System.in);
        FlightBooking flightBooking = new FlightBooking();

        System.out.println("Introduceti numele pasagerului: ");
        String name = obScanner.nextLine();

        System.out.println("Alegiti destinatia: ");
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