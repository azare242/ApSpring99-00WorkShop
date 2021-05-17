package WithBuffered;

import java.io.*;
import java.util.ArrayList;
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
        BufferedWriter bufferedWriter = null;

        try {
            File file = new File("notes\\" + note.getTitle());
            if (!file.exists()){
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(note.getDate() + '\n');
            bufferedWriter.write(note.getTitle() + '\n');
            bufferedWriter.write(note.getContent());


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (bufferedWriter != null)
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * List of files in a directory
     * @return array of files
     */
    private static File[] filesInDirectory(){
        File folder = new File("notes");
        return folder.listFiles();
    }
    /**
     * Read A WithStream.Note From a file
     * @param file file contains note
     * @return note
     */
    public static Note read(File file){
        try {
            FileReader fileReader = new FileReader("notes\\" + file.getName());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String date = bufferedReader.readLine();
            String title = bufferedReader.readLine();
            String content = bufferedReader.readLine();
            return new Note(title,content,date);
        } catch (IOException e) {
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
        File file = new File("notes\\" + name);
        file.delete();
    }
}
