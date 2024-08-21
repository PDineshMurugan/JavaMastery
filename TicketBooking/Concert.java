package TicketBooking;

public class Concert extends Event {

    private String artist;
    private String Type;
    int available_seats;
    // type: (Theatrical, Classical, Rock, Recital)

    Concert() {
        this.Type = "";
        this.artist = "";
    }

    Concert(String artist, String Type) {
        this.artist = artist;
        this.Type = Type;
    }

    public void setartist(String artist) {
        this.artist = artist;
    }

    public String getartist(String artist) {
        return artist;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int book_tickets(int num_tickets) {
        if (available_seats >= num_tickets) {
            available_seats = available_seats - num_tickets;
            return 1;
        }
        return 0;
    }

    public String display_concert_details() {
        return "" + "\nArtist:" + artist + "\nType:" + Type;
    }

}
