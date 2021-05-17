package WithStramNotSerialized;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
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
    public static void writeAll(ArrayList<Note> notes) {
        for (Note note : notes) {
            write(note);
        }
    }

    /**
     * Write A note to file
     * @param note note to write
     */
    public static void write(Note note) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("notSerializedNotes\\" + note.getTitle());
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            printWriter.write(note.getDate() + '\n' + note.getTitle() + '\n' + note.getContent());
            printWriter.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * List of files in a directory
     * @return array of files
     */
    private static File[] filesInDirectory(){
        File folder = new File("notSerializedNotes");
        return folder.listFiles();
    }
    /**
     * Read A WithStream.Note From a file
     * @param file file contains note
     * @return note
     */
    public static Note read(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream("notSerializedNotes\\" + file.getName());
            Scanner fileInput = new Scanner(fileInputStream);

            String date = fileInput.nextLine();
            String title = fileInput.nextLine();
            String content = fileInput.nextLine();

            return new Note(title,content,date);
        } catch (FileNotFoundException e) {
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
        File file = new File("notSerializedNotes\\" + name);
        file.delete();
    }
}
