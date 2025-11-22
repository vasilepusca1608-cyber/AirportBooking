import java.util.Scanner;

public class SettingFlightBooking {
    public static void main(String[] args) {

        Scanner obScanner           = new Scanner(System.in);
        FlightBooking flightBooking = new FlightBooking();

        obScanner.close();

        System.out.println("Introduceti numele pasagerului: ");
        String name = obScanner.nextLine();

        System.out.println("Alegiti destinatia: ");
        System.out.println("1. Paris");
        System.out.println("2. Roma");
        System.out.println("3. Londra");
        System.out.println("4. Barcelona");
        System.out.println("Introduceti numarul destinatiei: ");


    }
}