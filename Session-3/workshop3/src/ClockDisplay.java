/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before
 * midnight).
 *
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds; // ------------> add seconds
    private String displayString;    // simulates the actual display

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60); // ------------> add seconds
        updateDisplay();
    }
    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the
     * parameters.
     */
    public ClockDisplay(int hour, int minute,int second)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute,second);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        seconds.increment(); // ------------> add seconds
        if (seconds.getValue() == 0) { // ------------> add seconds
            minutes.increment();
            if (minutes.getValue() == 0) {  // it just rolled over!
                hours.increment();
            }
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     * @param hour hour
     * @param minute minute
     * @param second seconds // ------------> add seconds
     */
    public void setTime(int hour, int minute,int second ) // ------------> add seconds
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second); // ------------> add seconds
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     * @return displayString
     */
    public String getTime()
    {
        return displayString;
    }

    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" +
                minutes.getDisplayValue() + ":" + seconds.getDisplayValue(); // ------------> add seconds
    }

    public static void main(String[] args) {
        ClockDisplay c1 = new ClockDisplay(23,0,0);

        for (int i = 0 ; i < 3600 ; i++){
            c1.timeTick();
            System.out.println(c1.getTime());
        }

    }
}
