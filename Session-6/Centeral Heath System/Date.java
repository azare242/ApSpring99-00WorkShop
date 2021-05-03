/**
 * A class for date
 */
public class Date{

	/**
	 * fields
	 */
	private int year;
	private int month;
	private int day;

	/**
	 * constructor
	 */
	public Date(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**
	 * to string
	 */
	@Override
	public String toString(){
		return "" + year + "/" + month + "/" + day;
	}
}
