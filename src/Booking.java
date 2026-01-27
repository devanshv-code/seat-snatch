public class Booking {
    private int booking_id;
    private int contact_no;


    public Booking(int booking_id, int contact_no) {
        this.booking_id = booking_id;
        this.contact_no = contact_no;
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
