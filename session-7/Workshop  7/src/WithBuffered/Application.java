package WithBuffered;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Application Run Class
 *
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.may.16
 */
public class Application {
    /** Scanner form standard input*/
    private static final Scanner stdin = new Scanner(System.in);

    /**
     * Print main menu
     */
    private static void printMainMenu(){
        System.out.println(
                "1.New Note\n2.List Of All Notes\n3.Delete Note\n4.Exit"
        );
    }


    /**
     * Note exists
     * @param notes notes to check
     * @param title title to check
     * @return available note or not
     */
    private static boolean noteExists(ArrayList<Note> notes,String title){
        for (Note note : notes) {
            if (title.equals(note.getTitle())) return true;
        }
        return false;
    }

    /**
     * Add A New Note to application
     * @param notes ArrayList of note to add new note to it
     */
    private static void newNote(ArrayList<Note> notes){
        System.out.print("Title: ");
        String title = stdin.next();
        System.out.print("Content: ");
        String content = stdin.nextLine();
        content = stdin.nextLine();
        if (noteExists(notes,title)) {
            System.out.println("You have one note with this title,Try again");
            return;
        }
        Note newNote = new Note(title,content);
        FileUtils.write(newNote);
        notes.add(newNote);
        System.out.println("Note Successfully Created");
    }

    /**
     * Scan Index
     * @param notes arrayList notes for check index
     * @return the index
     */
    private static int scanIndex(ArrayList<Note> notes){
        int i;
        System.out.print("Enter index of file (if you want back enter -1): ");
        while (true){

            i = stdin.nextInt();
            if (i == -1) return i;
            else if (i > 0 && i <= notes.size()) return i - 1;
            else System.out.println("Invalid input , try again");
        }
    }

    /**
     * Remove a note Menu
     * @param notes arraylist of notes for remove note from it
     */
    private static void removeNote(ArrayList<Note> notes){
        if (notes.isEmpty()) {
            System.out.println("You don't have any notes");
            return;
        }
        listNotes(notes);
        int index = scanIndex(notes);
        if (index == -1) return;
        String name = notes.get(index).getTitle() + ".bin";
        FileUtils.removeFile(name);
        notes.remove(index);
    }

    /**
     * List add Notes
     * @param notes notes to print
     */
    private static void listNotes(ArrayList<Note> notes){
        if (notes.isEmpty()) {
            System.out.println("You don't have any notes");
            return;
        }
        int i = 1;
        for (Note note : notes) {
            System.out.println(i + " - " + note.getTitle());
            i++;
        }
    }

    /**
     * Read A note with it details
     * @param notes notes arraylist
     */
    private static void readNote(ArrayList<Note> notes){
        int i = scanIndex(notes);
        if (i == -1) return;

        System.out.println(notes.get(i));
    }

    /**
     * Read Note Menu
     * @param notes notes arraylist
     */
    private static void readNoteMenu(ArrayList<Note> notes){
        listNotes(notes);
        if (notes.isEmpty()) return;
        System.out.println("A.Read a note\nB.Back");
        String chose = stdin.next();
        switch (chose) {
            case "A", "a" -> {
                readNote(notes);
            }
            case "B" , "b" -> {
                return;
            }
            default -> System.out.println("Invalid input , Try again");
        }
    }

    /**
     * Menu of application
     * @param notes notes
     * @return when user chose exit return false to stop application
     */
    private static boolean menu(ArrayList<Note> notes){
        String chose = stdin.next();
        switch (chose){
            case "1" -> {
                newNote(notes);
                return true;
            }
            case "2" -> {
                readNoteMenu(notes);
                return true;
            }
            case "3" -> {
                removeNote(notes);
                return true;
            }
            case "4" -> {
                return false;
            }
            default -> {
                System.out.println("Invalid input , Try again");
                return true;
            }
        }
    }

    /**
     * Run application
     */
    public static void run(){
        File directoryForNotes = new File("notes");
        if (!directoryForNotes.exists()) {
            directoryForNotes.mkdirs();
        }
        ArrayList<Note> notes;
        if (directoryForNotes.listFiles().length == 0) notes = new ArrayList<>();
        else notes = FileUtils.readAll();



        boolean running = true;
        while (running){
            printMainMenu();
            running = menu(notes);
        }
    }
}
