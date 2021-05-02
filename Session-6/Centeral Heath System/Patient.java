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

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public char getGender() {
        return gender;
    }

    public String getBasicInsurance() {
        return basicInsurance;
    }

    public String getSupplementaryInsurance() {
        return supplementaryInsurance;
    }

    public String getJob() {
        return job;
    }

    public String getDegreeOfEducation() {
        return degreeOfEducation;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Physician> getTrustedPhysician() {
        return trustedPhysician;
    }

    public void addTrustedPhysician(Physician physician){
        trustedPhysician.add(physician);
    }
}
