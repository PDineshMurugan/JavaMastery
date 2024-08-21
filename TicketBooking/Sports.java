package TicketBooking;

public class Sports extends Event {

    private String sportName;
    private String teamName;
    int available_seats;

    Sports() {
        this.sportName = "";
        this.teamName = "";
    }

    Sports(String sportName, String teamName) {
        this.sportName = sportName;
        this.teamName = teamName;
    }

    public void setteamName(String teamName) {
        this.teamName = teamName;
    }

    public String getteamName() {
        return teamName;
    }

    public void setsportName(String sportName) {
        this.sportName = sportName;
    }

    public String getsportName() {
        return sportName;
    }

    public int book_tickets(int num_tickets) {
        if (available_seats >= num_tickets) {
            available_seats = available_seats - num_tickets;
            return 0;
        }
        return 1;
    }

    public String display_sport_details() {
        return "" + "\nSport Name:" + sportName + "\nTeam Name:" + teamName;
    }

}
