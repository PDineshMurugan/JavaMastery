package TicketBooking;

class Event {
    private String eventName;
    private String eventDate;
    private String time;
    private String venueName;
    private int totalSeats;
    private int available_seats;
    private double ticket_price;
    private String event_type;

    Event() {

    }

    Event(String eventName, String eventDate, String time, String venueName, int totalSeats, int available_seats,
            double ticket_price, String event_type) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.time = time;
        this.venueName = venueName;
        this.totalSeats = totalSeats;
        this.available_seats = available_seats;
        this.ticket_price = ticket_price;
    }

    // Event Name
    public String geteventName() {
        return eventName;
    }

    public void seteventName(String eventName) {
        this.eventName = eventName;
    }

    // eventDate
    public String geteventDate() {
        return eventDate;
    }

    public void seteventDate(String eventName) {
        this.eventName = eventName;
    }

    // time
    public String gettime() {
        return time;
    }

    public void settime(String time) {
        this.time = time;
    }

    // venue name
    public String getvenueName() {
        return venueName;
    }

    public void setvenueName(String venueName) {
        this.venueName = venueName;
    }

    // seats
    public int gettotalSeats() {
        return totalSeats;
    }

    public void settotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    // available seats
    public int getavailable_seats() {
        return available_seats;
    }

    public void setavailable_seats(int available_seats) {
        this.available_seats = available_seats;
    }

    // ticektprice
    public double getticket_price() {
        return ticket_price;
    }

    public void setticket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }

    // event_type
    public String getevent_type() {
        return event_type;
    }

    public void settevent_type(String event_type) {
        this.event_type = event_type;
    }
    // methods----------------------------

    public double calculate_total_revenue() {
        return ticket_price * (totalSeats - available_seats);
    }

    // booking
    public int book_tickets(int num_tickets) {
        if (available_seats >= num_tickets) {
            available_seats = available_seats - num_tickets;
            return 1;
        }
        return available_seats;
    }

    public int getBookedNoOfTickets() {
        return totalSeats - available_seats;
    }

    public int cancel_booking(int num_tickets) {
        return available_seats = available_seats + num_tickets;
    }

    public String display_event_details() {

        return "" + "\nEvent Name:" + eventName + "\nEvent Date:" + eventDate + "\nEvent Time:" + time
                + "\nAvailability:" + available_seats;
    }

}
