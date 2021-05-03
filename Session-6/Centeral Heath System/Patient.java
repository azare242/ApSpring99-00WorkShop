import java.util.ArrayList;

public class Patient {

    private String name;
    private Date birthDate;
    private char gender;
    private String basicInsurance;
    private String supplementaryInsurance;
    private String job;
    private String degreeOfEducation;
    private String location;
    private ArrayList<Physician> trustedPhysician;

    public Patient(String name, Date birthDate, char gender, String basicInsurance, String supplementaryInsurance, String job, String degreeOfEducation, String location,  Physician firstTrustedPhysician) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.basicInsurance = basicInsurance;
        this.supplementaryInsurance = supplementaryInsurance;
        this.job = job;
        this.degreeOfEducation = degreeOfEducation;
        this.location = location;
        this.trustedPhysician = new ArrayList<>();
        this.trustedPhysician.add(firstTrustedPhysician);
    }

    /**
     * get name
     */
    public String getName() {
        return name;
    }

    /**
     * get birth date
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * get gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * get Basic Insurance
     */
    public String getBasicInsurance() {
        return basicInsurance;
    }

    /**
     * get Supplementary Insurance
     */
    public String getSupplementaryInsurance() {
        return supplementaryInsurance;
    }

    /**
     * get job
     */
    public String getJob() {
        return job;
    }

    /**
     * get Degree Of Education
     */
    public String getDegreeOfEducation() {
        return degreeOfEducation;
    }

    /**
     * get location
     */
    public String getLocation() {
        return location;
    }

    /**
     * get Trusted Physician
     */
    public ArrayList<Physician> getTrustedPhysician() {
        return trustedPhysician;
    }

    /**
     * Add trusted physician
     */
    public void addTrustedPhysician(Physician physician){
        trustedPhysician.add(physician);
    }
}
