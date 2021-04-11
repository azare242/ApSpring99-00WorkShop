import ir.huri.jcal.JalaliCalendar;

import java.util.*;

/**
 * A Class That Contains A Voting Details
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.april.8
 */
public class Voting {
    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> choices;
    {
        voters = new ArrayList<>();
        choices = new HashMap<>();
    }

    /**
     * Constructor
     * @param type type
     * @param question question
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
    }

    /**
     * Get Type Method
     * @return type
     */
    public int getType() {
        return type;
    }

    /**
     * Get Question
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Get Voters
     * @return voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * Get choices
     * @return choices
     */
    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    /**
     * create poll method
     * @param choice question
     */
    public void createChoice(String choice){
        this.choices.put(choice,new HashSet<Vote>());
    }

    /**
     * Print Choices name
     */
    public void printChoicesName(){
        int i = 1;
        for (String choice : choices.keySet()) {
            System.out.print(i + ".");
            System.out.println(choice);
            i++;
        }
    }
    /**
     * Vote Method for type 1 (Multi choice)
     * @param person person who votes
     * @param choices persons choices
     */
    public void vote(Person person,ArrayList<String> choices){
        JalaliCalendar date = new JalaliCalendar();
        for (String choice : choices ){
            if (this.choices.containsKey(choice)) {
                Vote newVote = new Vote(person, date.toString());
                this.choices.get(choice).add(newVote);
            }
        }
        this.voters.add(person);
    }

    /**
     * Total Votes in Voting Count
     * @return total votes
     */
    private int totalVotes(){
        int sum = 0;
        for (HashSet<Vote> votes : this.choices.values()){
            sum += votes.size();
        }
        return sum;
    }

    /**
     * Print Votes Method
     * @param choice choice to print votes
     */
    public void printVotes(String choice){
        if (choices.get(choice).isEmpty()) {
            System.out.println("there is no votes");
            return;
        }

        System.out.print("Votes: ");
        for (Vote toPrint : choices.get(choice)) {
            System.out.print(toPrint.details());
            System.out.print("    ");
        }

        System.out.println();
    }

    /**
     * Print Result Table Method
     */
    public void printResult(){
        System.out.println(
                "Choice     | Votes | %\n" +
                "-----------------------------"
        );

        for(Map.Entry<String,HashSet<Vote>> entry : this.choices.entrySet()){
            int votes = entry.getValue().size();
            double percent = votes != 0 ? 100 * ((double) entry.getValue().size() / (double) totalVotes()) : 0;
            System.out.printf("%-10s | %-5d | %-8.2f\n",entry.getKey() ,votes,percent);
            printVotes(entry.getKey());
            System.out.println("-----------------------------");
            }


    }

    /**
     * get choices count method
     * @return choices count
     */
    public int getChoicesCount(){
        return this.choices.size();
    }
}
