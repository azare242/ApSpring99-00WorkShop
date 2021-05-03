import java.util.ArrayList;

/**
 * A Class for Central Health System
 */
public class CentralHealthSystem {

    /**
     * Fields
     */
    private ArrayList<Physician> physicians;
    private ArrayList<Patient> patients;
    private ArrayList<MedicalRecord> medicalRecords;

    /**
     * constructor
     */
    public CentralHealthSystem() {
        this.physicians = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();
    }

    /**
     * add patient
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    /**
     * add physician
     */
    public void addPhysician(Physician physician) {
        physicians.add(physician);
    }

    /**
     * add Medical record
     */
    public void addMedicalRecord(MedicalRecord medicalRecord){
        medicalRecords.add(medicalRecord);
    }

    /**
     * show medical record
     */
    public void showMedicalRecord(MedicalRecord medicalRecord) {}

    /**
     * Commision a patient by a physician
     */
    public void physicianComissionPatient(Physician physician , MedicalRecord medicalRecord , Patient patient) {}

}
