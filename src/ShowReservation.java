public class ShowReservation {

    public void display(FlightBooking booking) {
        System.out.println("Detaliile rezervarii:");
        System.out.println("Nume pasager: "     + booking.getPassengerName());
        System.out.println("Destinatie: "       + booking.getDestination());
        System.out.println("Companie aeriana: " + booking.getAirline());
        System.out.println("Clasa locului: "    + booking.getSeatClass());
        System.out.println("Are bagaj: "        + (booking.isHasLuggage() ? "Da" : "Nu"));
    }
}
