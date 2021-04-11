import java.util.*;

/**
 * A Class That Contains A VotingSystem Details
 * @author Alireza ZareZeynabadi
 * @version 1.0
 * @since 2021.april.10
 */
public class VotingSystem {

    private ArrayList<Voting> votingList;

    /**
     * Constructor
     */
    public VotingSystem(){
        votingList = new ArrayList<>();
    }

    /**
     * Create a Voting Method
     * @param question Question
     * @param type type
     * @param choices choice
     */
    public void createVoting(String question , int type ,ArrayList<String> choices){
        Voting newVoting = new Voting(type,question);
        for (String choice : choices) newVoting.createChoice(choice);
        votingList.add(newVoting);
    }

    /**
     * Print All Voting That Added To System
     */
    public void printListOfVoting(){
        int i = 1;
        for (Voting voting : votingList) {
            System.out.print(i + ". ");
            System.out.println(voting.getQuestion());
            i++;
        }
    }

    /**
     * Print Voting And Choices Method
     * @param index index
     */
    public void printVoting(int index){
        Voting voting = votingList.get(index);
        System.out.println(voting.getQuestion());
        voting.printChoicesName();
    }

    /**
     * Vote Method
     * @param index voting index
     * @param person person who votes
     * @param choices choices
     */
    public void vote(int index,Person person,ArrayList<String> choices){
        Voting voting = votingList.get(index);
        voting.vote(person,choices);
    }

    /**
     * Print Voting Result
     * @param index index
     */
    public void printResult(int index){
        votingList.get(index).printResult();
    }

    /**
     * check voting lists is empty or not
     * @return voting list empty ot not
     */
    public boolean votingListEmptyOrNot(){
        return this.votingList.isEmpty();
    }

    /**
     * Out Of Index Method
     * @param index index
     * @return out or not of index
     */
    public boolean outOfIndex(int index){
        return this.votingList.size() < index;
    }

    /**
     * Get Voting From List
     * @param index index
     * @return voting
     */
    public Voting getVotingFromList(int index){
        return this.votingList.get(index);
    }

}
