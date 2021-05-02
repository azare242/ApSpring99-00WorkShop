public class Theatre{
	private String name;
	private Date date;
	private Time time;
	private Salon salon;

	public Theatre(String name, Date date, Time time, Salon salon) {
		this.name = name;
		this.date = date;
		this.time = time;
		this.salon = salon;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public Time getTime() {
		return time;
	}

	public Salon getSalon() {
		return salon;
	}
}
