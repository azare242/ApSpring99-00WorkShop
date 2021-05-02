public class Reserve {

    private Theatre theatre;
    private Seat seat;
    private Customer customer;
    private Date date;
    private Time time;

    public Reserve(Theatre theatre, Seat seat, Customer customer, Date date, Time time) {
        this.theatre = theatre;
        this.seat = seat;
        this.customer = customer;
        this.date = date;
        this.time = time;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public Seat getSeat() {
        return seat;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }
}
