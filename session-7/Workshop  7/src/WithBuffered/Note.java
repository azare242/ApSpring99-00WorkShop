package WithBuffered;

import java.io.*;
import java.util.Date;

/**
 * A Class For Hold A WithStream.Note Details
 *
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.may.15
 */
public class Note {

    /** A WithStream.Note Fields*/
    private String title;
    private String content;
    private String date;

    /**
     * Constructor
     *
     * initialize fields
     * @param title title of note
     * @param content content of note
     */
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.date = new Date().toString();
    }

    /**
     * Constructor
     *
     * initialize fields
     * @param title title of note
     * @param content content of note
     * @param date date modified
     */
    public Note(String title,String content,String date){
        this(title,content);
        this.date = date;

    }
    /**
     * Get Title of WithStream.Note
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * get content of note
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * Get date of note
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * To string method
     * @return {
     *[ date ]
     * title:
     * content
     *} as a string
     */
    @Override
    public String toString() {
        return
                "[ " + date + " ]\n" + title + " :\n"+ content;
    }
}
