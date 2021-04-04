/**
 * A Class That Contains Music Details
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.april.4
 */
public class Music {

    private String name;
    private String artistName;
    private int yearReleased;

    /**
     * Constructor
     * @param name name
     * @param artistName artist name
     * @param yearReleased year released
     */
    public Music(String name, String artistName, int yearReleased) {
        this.name = name;
        this.artistName = artistName;
        this.yearReleased = yearReleased;
    }

    /**
     * get name method
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set name method
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get artist name method
     * @return artist name
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * set artist name
     * @param artistName artist name
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * get year released
     * @return year released
     */
    public int getYearReleased() {
        return yearReleased;
    }

    /**
     * set year released
     * @param yearReleased year released
     */
    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    private String musicToString() {
        return
                "Name: " + this.name +
                " , Artist Name: " + this.artistName +
                " , Year Released: " + this.yearReleased ;
    }

    public void printMusicDetails(){
        System.out.println(this.musicToString());
    }
}
