package TicketBooking;

// Attributes:
// 1. genre: Genre of the movie (e.g., Action, Comedy, Horror).
// 2. ActorName
// 3. ActresName
// o Methods:
// 1. Implement default constructors and overload the constructor with Customer
// attributes, generate getter and setter methods.
// 2. display_event_details(): Display movie details, including genre.

class Movie extends Event {
    private String genre;
    private String ActorName;
    private String ActresName;
    int available_seats;

    Movie() {
        this.ActorName = "";
        this.ActresName = "";
        this.genre = "";
    }

    Movie(String genre, String ActorName, String ActresName) {
        this.ActorName = ActorName;
        this.genre = genre;
        this.ActresName = ActresName;
    }

    public void setgener(String genre) {
        this.genre = genre;

    }

    public String getgenre() {
        return genre;
    }

    public void setActorName(String ActorName) {
        this.ActorName = ActorName;
    }

    public String getActorName() {
        return ActorName;
    }

    public void setActresName(String ActresName) {
        this.ActresName = ActresName;
    }

    public String getActresName() {
        return ActresName;
    }

    public int book_tickets(int num_tickets) {
        if (available_seats >= num_tickets) {
            available_seats = available_seats - num_tickets;
            return 1;
        }
        return 0;
    }

    public String display_event_details() {
        return "" + "\nGenre:" + genre + "\nActorName:" + ActorName + "\nActres Name:" + ActresName;
    }
}
