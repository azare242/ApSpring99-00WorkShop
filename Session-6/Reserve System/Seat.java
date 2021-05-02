public class Seat{
	private int number;
	private boolean isEmpty;
	public Seat(int number){
		this.number = number;
		this.isEmpty = true;
	}

	public int getNumber(){
		return number;
	}

	public void reserveSeat(){
		isEmpty = false;
	}

	public boolean getIsEmpty(){
		return isEmpty;
	}
}
