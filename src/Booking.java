public class Booking {
    private int booking_id;
    private int contact_no;
    Ride ride;
    int seatBooked;
    User user;
    double totalFare;

    public Booking(int contact_no, int booking_id, Ride ride, int seatBooked, User user, double totalFare) {
        this.contact_no = contact_no;
        this.booking_id = booking_id;
        this.ride = ride;
        this.seatBooked = seatBooked;
        this.user = user;
        this.totalFare = totalFare;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }



}
