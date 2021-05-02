import java.util.ArrayList;

public class Show {
    private ArrayList<Theatre> theatres;

    public Show(ArrayList<Theatre> theatres) {
        this.theatres = theatres;
    }

    public ArrayList<Theatre> getTheatres() {
        return theatres;
    }

    public void search(String name) {}
    public void printDetails(Theatre theatre) {}
    public void reserve(Customer customer , Theatre theatre) {}
}
