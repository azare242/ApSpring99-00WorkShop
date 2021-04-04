import java.util.*;
/**
 * A Class That Run A Music Player
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.March.15
 */
public class Main {
    /**
     * Main Menu {
     * 1.Add File
     * 2.Remove File
     * 3.Play Music
     * 4.Show Musics
     * 5.Exit
     * }
     */
    static void showMainMenu(){
        System.out.println(
                "1.Add File\n2.Remove File\n3.Play Music\n4.Show Musics\n5.Find Music\n6.Exit"
        );
    }

    /**
     * Add File Menu {
     * 1.Add Rock
     * 2.Add Pop
     * 3.Add Jazz
     * 4.Add Country
     * 5.Return To Main Menu
     * }
     */
    static void showAddFileMenu(){
        System.out.println(
                "1.Add Rock\n2.Add Pop\n3.Add Jazz\n4.Add Country\n5.Return To Main Menu"
        );
    }

    /**
     * Remove File Menu{
     * 1.Remove Rock
     * 2.Remove Pop
     * 3.Remove Jazz
     * 4.Remove Country
     * 5.Return To Main Menu
     * }
     */
    static void showRemoveFileMenu(){
        System.out.println(
                "1.Remove Rock\n2.Remove Pop\n3.Remove Jazz\n4.Remove Country\n5.Return To Main Menu"
        );
    }

    /**
     * Play Music Menu{
     * 1.Rock
     * 2.Pop
     * 3.Jazz
     * 4.Country
     * 5.Return To Main Menu
     * }
     */
    static void showPlayMusicMenu(){
        System.out.println(
                "1.Rock\n2.Pop\n3.Jazz\n4.Country\n5.Return To Main Menu"
        );
    }

    /**
     * Add file Method
     * @param in Scanner
     * @param rock Rock Collection
     * @param pop Pop Collection
     * @param jazz Jazz Collection
     * @param country Country Collection
     */
    static void addFile(Scanner in , MusicCollection rock , MusicCollection pop , MusicCollection jazz , MusicCollection country){
        // Add file Menu codes
        boolean conditionA = true;
        while (conditionA){
            showAddFileMenu();
            int opA = in.nextInt();
            switch (opA){
                case 1 -> { // add rock
                    System.out.print("Enter Name: ");
                    String name = in.next();
                    System.out.print("Enter Artist Name: ");
                    String artist = in.next();
                    System.out.print("Enter released year: ");
                    int year = in.nextInt();
                    rock.addFile(new Music(name,artist,year));
                    break;
                }
                case 2 -> { // add pop
                    System.out.print("Enter Name: ");
                    String name = in.next();
                    System.out.print("Enter Artist Name: ");
                    String artist = in.next();
                    System.out.print("Enter released year: ");
                    int year = in.nextInt();
                    pop.addFile(new Music(name,artist,year));
                    break;
                }
                case 3 ->{ // add jazz
                    System.out.print("Enter Name: ");
                    String name = in.next();
                    System.out.print("Enter Artist Name: ");
                    String artist = in.next();
                    System.out.print("Enter released year: ");
                    int year = in.nextInt();
                    jazz.addFile(new Music(name,artist,year));
                    break;
                }
                case 4 -> { // add country
                    System.out.print("Enter Name: ");
                    String name = in.next();
                    System.out.print("Enter Artist Name: ");
                    String artist = in.next();
                    System.out.print("Enter released year: ");
                    int year = in.nextInt();
                    country.addFile(new Music(name,artist,year));
                    break;
                }
                case 5 -> conditionA = false;

                default -> System.out.println("Invalid Input");
            }
        }
    }
    /**
     * Remove file Method
     * @param in Scanner
     * @param rock Rock Collection
     * @param pop Pop Collection
     * @param jazz Jazz Collection
     * @param country Country Collection
     */
    static void removeFile(Scanner in , MusicCollection rock , MusicCollection pop , MusicCollection jazz , MusicCollection country ){
        // Remove File Menu Codes
        boolean conditionR = true;
        while (conditionR){
            showRemoveFileMenu();
            int opR = in.nextInt();
            switch (opR){
                case 1 -> { // Remove Rock
                    rock.listAllFiles();
                    System.out.print("Enter Number Of File: ");
                    int toRemove = in.nextInt();
                    rock.removeFile(toRemove);
                    break;
                }
                case 2 -> { // Remove Pop
                    pop.listAllFiles();
                    System.out.print("Enter Number Of File: ");
                    int toRemove = in.nextInt();
                    pop.removeFile(toRemove);
                }
                case 3 -> { // Remove Jazz
                    jazz.listAllFiles();
                    System.out.print("Enter Number Of File: ");
                    int toRemove = in.nextInt();
                    jazz.removeFile(toRemove);
                    break;
                }
                case 4 -> { // Remove Country
                    country.listAllFiles();
                    System.out.print("Enter Number Of File: ");
                    int toRemove = in.nextInt();
                    country.removeFile(toRemove);
                }
                case 5 -> conditionR = false;
                default -> System.out.println("Invalid Input");
            }
        }
    }
    /**
     * Play Music Method
     * @param in Scanner
     * @param rock Rock Collection
     * @param pop Pop Collection
     * @param jazz Jazz Collection
     * @param country Country Collection
     */
    static void playMusic(Scanner in , MusicCollection rock , MusicCollection pop , MusicCollection jazz , MusicCollection country ){
        // Play Music Menu Codes
        boolean conditionP = true;
        while (conditionP) {
            showPlayMusicMenu();
            int opP = in.nextInt();
            switch (opP) {
                case 1 -> { // Play Rock
                    rock.listAllFiles();
                    int toPlay = in.nextInt();
                    rock.startPlaying(toPlay);
                    System.out.println("When you want stop enter 0");
                    boolean playing = true;
                    // Playing Music While it's doesn't Stop
                    while (playing){
                        int stop = in.nextInt();
                        if (stop == 0) {
                            rock.stopPlaying();
                            playing = false;
                        }
                        else System.out.println("Invalid Input");
                    }
                    break;
                }
                case 2 -> { // Play Pop
                    pop.listAllFiles();
                    int toPlay = in.nextInt();
                    pop.startPlaying(toPlay);
                    System.out.println("When you want stop enter 0");
                    boolean playing = true;
                    // Playing Music While it's doesn't Stop
                    while (playing){
                        int stop = in.nextInt();
                        if (stop == 0) {
                            pop.stopPlaying();
                            playing = false;
                        }
                        else System.out.println("Invalid Input");
                    }
                    break;
                }
                case 3 ->{ // Play Jazz
                    jazz.listAllFiles();
                    int toPlay = in.nextInt();
                    jazz.startPlaying(toPlay);
                    System.out.println("When you want stop enter 0");
                    boolean playing = true;
                    // Playing Music While it's doesn't Stop
                    while (playing){
                        int stop = in.nextInt();
                        if (stop == 0) {
                            jazz.stopPlaying();
                            playing = false;
                        }
                        else System.out.println("Invalid Input");
                    }
                    break;
                }
                case 4 -> { // Play Country
                    country.listAllFiles();
                    int toPlay = in.nextInt();
                    country.startPlaying(toPlay);
                    System.out.println("When you want stop enter 0");
                    boolean playing = true;
                    // Playing Music While it's doesn't Stop
                    while (playing){
                        int stop = in.nextInt();
                        if (stop == 0) {
                            country.stopPlaying();
                            playing = false;
                        }
                        else System.out.println("Invalid Input");
                    }
                    break;
                }
                case 5 -> conditionP = false;
                default -> System.out.println("Invalid Input");
            }
        }
    }
    /**
     * Show Musics Method
     * @param rock Rock Collection
     * @param pop Pop Collection
     * @param jazz Jazz Collection
     * @param country Country Collection
     */
    static void showMusics( MusicCollection rock , MusicCollection pop , MusicCollection jazz , MusicCollection country ){
        System.out.println("*********************************");
        System.out.println("Rocks: ");
        rock.listAllFiles();
        System.out.println("------------------------");
        System.out.println("Pops: ");
        pop.listAllFiles();
        System.out.println("------------------------");
        System.out.println("Jazzes: ");
        jazz.listAllFiles();
        System.out.println("------------------------");
        System.out.println("Countries: ");
        country.listAllFiles();
        System.out.println("*********************************");
    }

    /**
     * search method
     * @param musics music collection
     * @param name name to search
     * @return found music
     */
    static Music search(MusicCollection musics,String name){
        Iterator<Music> rockIterator = musics.getFiles().iterator();
        while (rockIterator.hasNext()){
            Music temp = rockIterator.next();
            if (temp.getName().equals(name))
                return temp;
        }
        return null;
    }

    /**
     * music exist method
     * @param musics music collection
     * @param name name to search
     * @return existence of music
     */
    static boolean musicExist(MusicCollection musics,String name){
        Iterator<Music> rockIterator = musics.getFiles().iterator();
        while (rockIterator.hasNext()){
            Music temp = rockIterator.next();
            if (temp.getName().equals(name))
                return true;
        }
        return false;
    }

    /**
     * find Music Method
     * @param in scanner
     * @param rock rock
     * @param pop pop
     * @param jazz jazz
     * @param country country
     */
    static void findMusic(Scanner in , MusicCollection rock , MusicCollection pop , MusicCollection jazz , MusicCollection country ){
        System.out.print("Enter Name Of Music: ");
        String toSearch = in.next();
        if (musicExist(rock,toSearch))
            search(rock,toSearch).printMusicDetails();
        else if (musicExist(pop,toSearch))
            search(pop,toSearch);
        else if (musicExist(jazz,toSearch))
            search(jazz,toSearch).printMusicDetails();
        else if (musicExist(country,toSearch))
            search(country,toSearch).printMusicDetails();
        else
            System.out.println("Music Not Found!");
    }
    /**
     * Driver Program
     * @param args Program Arguments
     */
    public static void main(String[] args) {

        MusicCollection pop = new MusicCollection(); // Pop Collection Object
        MusicCollection jazz = new MusicCollection(); // jazz Collection Object
        MusicCollection rock = new MusicCollection(); // rock Collection Object
        MusicCollection country = new MusicCollection(); // Country Collection Object

        // Main Menu Codes
        boolean conditionM = true;
        Scanner in = new Scanner(System.in);
        while (conditionM) {
            showMainMenu();
            int opM = in.nextInt();
            switch (opM){
                case 1 -> {
                    addFile(in,rock,pop,jazz,country);
                    break;
                }
                case 2 ->{
                    removeFile(in,rock,pop,jazz,country);
                    break;
                }
                case 3 -> {
                    playMusic(in,rock,pop,jazz,country);
                    break;
                }
                case 4 ->{ // Show Musics Codes
                    showMusics(rock,pop,jazz,country);
                    break;

                }
                case 5 -> {
                    findMusic(in,rock,pop,jazz,country);
                    break;
                }
                //Exit
                case 6 -> conditionM = false;
                default -> System.out.println("Invalid Input");

            }
        }
    }
}
