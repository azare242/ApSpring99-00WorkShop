import java.util.*;

/**
 * A Class That Contains A Menu for run a voting system details
 * @author Alireza ZareZenadabi
 * @version 1.0
 * @since 2021.april.11
 */
public class RunMenu {

    private static final Scanner in = new Scanner(System.in);

    private static void showMainMenu() {
        System.out.println(
                "1.Administrator\n2.Vote\n3.Exit"
        );
    }

    private static void showAdministratorMenu() {
        System.out.println(
                "1.Add voting\n2.Results\n3.Log out"
        );
    }

    private static int scanVotingType(){
        while (true){
            System.out.print("Enter Voting Type: (0 -> Single Answer | 1 -> Multi Answer): ");
            int type = in.nextInt();
            if (type == 1 || type == 0) return type;
            else
                System.out.println("Invalid Input,Trt Again");
        }
    }
    private static void administratorAddVoting(VotingSystem system){
        System.out.print("Enter Question: ");
        String question = in.next();
        int type = scanVotingType();
        System.out.print("How Much Choice The Voting has?: ");
        int choicesCount = in.nextInt();
        ArrayList<String> choicesList = new ArrayList<>();
        for (int i = 0 ; i < choicesCount ; ++i){
            String choice = in.next();
            choicesList.add(choice);
        }
        system.createVoting(question,type,choicesList);
    }
    private static int scanIndex(VotingSystem system){
        while (true){
            int index = in.nextInt();
            if (!system.outOfIndex(index)) return index;
            else
                System.out.println("Invalid input,Try Again");
        }
    }
    private static void administratorSeeResults(VotingSystem system){
        if (system.votingListEmptyOrNot()) {
            System.out.println("There is no voting");
            return;
        }
        system.printListOfVoting();
        System.out.print("Enter Voting Number That You Want See Result: ");
        int choose = scanIndex(system);
        choose--;
        system.printResult(choose);
    }
    private static void administrator(VotingSystem system) {

            boolean condition = true;
            while (condition) {
                showAdministratorMenu();
                int op = in.nextInt();
                switch (op) {
                    case 1 -> administratorAddVoting(system);
                    case 2 -> administratorSeeResults(system);
                    case 3 -> condition = false;
                }
            }

    }
    private static Person scanPerson(){
        System.out.print("Fist name: ");
        String firstName = in.next();
        System.out.print("Last name: ");
        String lastName = in.next();
        return new Person(firstName,lastName);
    }
    private static ArrayList<String> scanChoices(Voting voting){
        System.out.println("Enter The Name of Choices You Want Vote (End it with -1): ");
        ArrayList<String> choices = new ArrayList<>();

        if (voting.getType() == 0) {
            String choice = in.next();
            choices.add(choice);
            return choices;
        }

        int i = 0;
        while (i < voting.getChoicesCount()){
            String choice = in.next();
            if (choice.charAt(0) == '-' && choice.charAt(1) == '1') break;
            else {
                if (voting.getChoices().containsKey(choice)) {
                    choices.add(choice);
                    System.out.println("Added");
                    i++;
                }
                else
                    System.out.println("Invalid Input,Try Again");
            }
        }
        return choices;
    }
    private static ArrayList<String> randomChoices(Voting voting){
        Random random = new Random();
        ArrayList<String> choicesArrayList = new ArrayList<>(voting.getChoices().keySet());
        ArrayList<String> choices = new ArrayList<>();
        int i = 0 , choicesRandomCount = voting.getType() == 1 ? random.nextInt(voting.getChoicesCount()) : 1;
        while (i < choicesRandomCount){
            String randomChoice = choicesArrayList.get(random.nextInt(voting.getChoicesCount()));
            if (!choices.contains(randomChoice)) {
                choices.add(randomChoice);
                i++;
            }
        }
        return choices;
    }
    private static void voter(VotingSystem system){
        if (system.votingListEmptyOrNot()) {
            System.out.println("There is no voting to vote");
            return;
        }
        Person person = scanPerson();
        system.printListOfVoting();
        System.out.print("Enter Number Of Voting that you want to vote: ");
        int index = scanIndex(system);
        index--;
        system.printVoting(index);
        Voting voting = system.getVotingFromList(index);
        System.out.println("1.Random\n2.Manual");
        int mode = in.nextInt();
        ArrayList<String> choices = null;

        if (mode == 2) choices = scanChoices(voting);
        else if (mode == 1) choices = randomChoices(voting);
        else {
            System.out.println("Invalid input,Try Again");
            return;
        }
        system.vote(index,person,choices);
        System.out.println("done");
    }

    /**
     * Run Program From Here
     * @param system Banking System
     */
    public static void runProgram(VotingSystem system) {
        boolean programRunning = true;
        while (programRunning) {
            showMainMenu();
            int op = in.nextInt();
            switch (op) {
                case 1 -> administrator(system);
                case 2 -> voter(system);
                case 3 -> programRunning = false;
            }
        }
    }
}
