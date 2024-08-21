package TicketBooking;

public class Customer {

    private String customer_name;
    private String email;
    private String phone_number;

    Customer() {

    }

    Customer(String customer_name, String email, String phone_number) {
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    // customer name
    public String getCustomer_name() {
        return customer_name;
    }

    public void setcustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    // email
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    // phone_number
    public String getphone_number() {
        return phone_number;
    }

    public void setphone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String display_customer_details() {
        return "" + "\nCustomer Name: " + customer_name + "\nEmail:" + email + "\nPhone Number:" + phone_number;

    }
}
