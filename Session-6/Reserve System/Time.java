public class Time{

	private int hour;
	private int minute;
	private int second;

	public Time(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString(){
		String hours = "";
		if (this.hour < 10) hours = "0" + this.hour;
		else hours = String.valueOf(this.hour);

		String minutes = "";
		if (this.minute < 10) minutes = "0" + this.minute;
		else minutes = String.valueOf(this.minute);

		String seconds = "";
		if (this.second < 10) seconds = "0" + this.second;
		else seconds = String.valueOf(this.second);

		return
			hours + ":" + minutes + ":" + seconds;	
	}	
}
