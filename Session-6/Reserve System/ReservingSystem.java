import java.util.ArrayList;

public class ReservingSystem {
    private ArrayList<Theatre> theatres;
    private Show show;

    public ReservingSystem(ArrayList<Theatre> theatres, Show show) {
        this.theatres = theatres;
        this.show = show;
    }

    public Show getShow() {
        return show;
    }

    public ArrayList<Theatre> getTheatres() {
        return theatres;
    }

    public void reserve(Customer customer, Theatre theatre) {}
}
