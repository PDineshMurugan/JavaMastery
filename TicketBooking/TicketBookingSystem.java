package TicketBooking;

import java.util.Scanner;

class TicketBookingSystem {
    // create_event(event_name: str, date:str, time:str, total_seats: int,
    // ticket_price:
    // float, event_type: str, venu_name:str):
    // //, time:str, total_seats: int, ticket_price:
    // float, event_type: str, venu_name:str): Create a new event with the specified
    // details
    // and event type (movie, sport or concert) and return event object.

    public static void main(String[] args) {
        // create a Instance
        Sports sports = new Sports();
        Movie movie = new Movie();
        Concert concert = new Concert();

        //

        Scanner sc = new Scanner(System.in);
        System.out.println("Event Name:");
        String eventName = sc.nextLine();

        System.out.println("Date:");
        String date = sc.nextLine();

        System.out.println("Time:");
        String time = sc.nextLine();

        System.out.println("Total Seats:");
        int totalSeats = sc.nextInt();

        System.out.println("Ticket Price:");
        double ticket_price = sc.nextDouble();

        System.out.println("Available Seats:");
        int available_seats = sc.nextInt();

        System.out.println("Event Type:");
        String event_type = sc.nextLine();

        System.out.println("Venue Name:");
        String venueName = sc.nextLine();

        System.out.println("No of Tickets");
        int num_tickets = sc.nextInt();
        // creat a event details
        Event event = new Event(eventName, date, time, venueName, totalSeats, available_seats, ticket_price,
                event_type);
        // booking tickets
        if (event.book_tickets(num_tickets) > 0) {
            System.out.println("There is only a " + event.book_tickets(num_tickets) + "are available");
        } else if (event.book_tickets(num_tickets) == 0) {
            System.out.println("The Ticket Booked Successfully");
        }
        // cancle tickets
        System.out.println("\nGet Event Details to press:\n1.Movie\2.Sports\n3.Concert");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println(movie.display_event_details());
                break;
            case 2:

                System.out.println(sports.display_sport_details());
                break;
            case 3:

                System.out.println(concert.display_concert_details());
                break;
            default:
                break;
        }

        System.out.println(event.display_event_details());

    }

}
