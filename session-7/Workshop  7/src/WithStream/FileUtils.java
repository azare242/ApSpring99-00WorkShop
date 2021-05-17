package WithStream;

import java.io.*;
import java.util.*;

/**
 * A Class With Static methods for work with files
 *
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.may.15
 */
public class FileUtils {

    /**
     * Write A List Of Notes To files
     * @param notes notes to write
     */
    public static void writeAll(ArrayList<Note> notes){
        for (Note note : notes){
            write(note);
        }
    }

    /**
     * Write A note to file
     * @param note note to write
     */
    public static void write(Note note){
        String fileName = "BinaryNotes\\" + note.getTitle() + ".bin" ;
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(note);
            fileOutputStream.close();
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * List of files in a directory
     * @return array of files
     */
    private static File[] filesInDirectory(){
        File folder = new File("BinaryNotes");
        return folder.listFiles();
    }

    /**
     * Read A WithStream.Note From a file
     * @param file file contains note
     * @return note
     */
    public static Note read(File file){
        try(FileInputStream fileInputStream = new FileInputStream("BinaryNotes\\" + file.getName())) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Note note = (Note) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
            return note;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Read All files and save it to an ArrayList
     * @return Notes ArrayList
     */
    public static ArrayList<Note> readAll(){
        ArrayList<Note> notes = new ArrayList<>();
        File[] files = filesInDirectory();

        for (File file : files) {
            notes.add(read(file));
        }
        return notes;
    }

    /**
     * Delete a file
     * @param name file name to remove
     */
    public static void removeFile(String name){
        File file = new File("BinaryNotes\\" + name);
        file.delete();
    }
}
