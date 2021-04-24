package WithInheritance;

/**
 * A Class That Contains Side Details
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.april.24
 */
public class Side {

    /** Side Has A Length*/
    private final double length;

    /**
     * Constructor for initialize Side with its legnth
     * @param length length
     */
    public Side(double length){
        this.length = length;
    }

    /**
     * Get Length method
     * @return length
     */
    public double getLength(){
        return length;
    }

    /**
     * Equal Length method
     * @param side other side
     * @return equality of lengths
     */
    public boolean equalLength(Side side){
        return this.length == side.length;
    }
}
