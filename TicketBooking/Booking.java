package TicketBooking;

public class Booking {
    // Booking Class to represent the Tiket booking system. Perform the following
    // operation in main
    // method. Note:- Use Event class object for the following operation.
    // • Methods and Constuctors:
    // o calculate_booking_cost(num_tickets): Calculate and set the total cost of
    // the
    // booking.
    // o book_tickets(num_tickets): Book a specified number of tickets for an event.
    // o cancel_booking(num_tickets): Cancel the booking and update the available
    // seats.
    // o getAvailableNoOfTickets(): return the total available tickets
    // o getEventDetails(): return event details from the event class

    Event event = new Event();

    public double calculate_booking_cost(double num_tickets) {
        return num_tickets * event.getticket_price();
    }

}
