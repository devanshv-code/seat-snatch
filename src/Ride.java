public class Ride{
    private int id;
    private String source;
    private String destination;
    private int total_seats;
    private int available_seats;
    private double fare;
    private User user;


    public Ride(int id, String source, String destination, int total_seats, int available_seats, double fare, User user) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.total_seats = total_seats;
        this.available_seats = available_seats;
        this.fare = fare;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotal_seats() {
        return total_seats;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }

    public int getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(int available_seats) {
        this.available_seats = available_seats;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}



