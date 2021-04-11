import ir.huri.jcal.JalaliCalendar;

import java.util.Objects;

/**
 * A Class That Contains A Vote Details
 * @author Alireza ZareZeynabadi
 * @version 1.0
 * @since 2021.april.8
 */
public class Vote {
    private Person person;
    private String date;

    /**
     * Constructor
     * @param person voter person
     * @param date vote date
     */
    public Vote(Person person , String date){
        this.date = date;
        this.person = person;
    }

    /**
     * Get Person Method
     * @return person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Get Date Method
     * @return date
     */
    public String getDate() {
        return date;
    }

    public String details(){
        return this.person.getFirstName() + ' ' + this.person.getLastName() + ' ' + this.date;
    }
    /**
     * Equals Method
     * @param o object to compare
     * @return equality
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return getPerson().equals(vote.getPerson()) && getDate().equals(vote.getDate());
    }

    /**
     * HashCode Method
     * @return hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(getPerson(), getDate());
    }
}
