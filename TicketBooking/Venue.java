package TicketBooking;

public class Venue {

    private String venueName;
    private String address;

    Venue() {

    }

    Venue(String venue_name, String address) {
        this.address = address;
        this.venueName = venue_name;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String display_venue_details() {
        return "" + "\nAddress:" + address + "\nVenue:" + venueName;
    }

}
