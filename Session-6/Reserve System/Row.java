import java.util.ArrayList;
public class Row{
	ArrayList<Seat> seats;

	public Row(ArrayList<Seat> seats){
		this.seats = seats;
	}

	public ArrayList<Seat> getSeats(){
		return seats;
	}
}
