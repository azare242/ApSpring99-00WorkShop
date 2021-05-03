/**
 * A class for physician
 */
public class Physician {

    /**
     * Fields
     */
    private String name;
    private String expertize;

    /**
     * Constructor
     */
    public Physician(String name, String expertize) {
        this.name = name;
        this.expertize = expertize;
    }

    /**
     * Get name
     */
    public String getName() {
        return name;
    }

    /**
     * get expertize
     */
    public String getExpertize() {
        return expertize;
    }
}
