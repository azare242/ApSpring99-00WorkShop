import java.util.ArrayList;

public class CentralHealthSystem {
    private ArrayList<Physician> physicians;
    private ArrayList<Patient> patients;
    private ArrayList<MedicalRecord> medicalRecords;

    public CentralHealthSystem() {
        this.physicians = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addPhysician(Physician physician) {
        physicians.add(physician);
    }

    public void addMedicalRecord(MedicalRecord medicalRecord){
        medicalRecords.add(medicalRecord);
    }

    public void showMedicalRecord(MedicalRecord medicalRecord) {}
    public void physicianComissionPatient(Physician physician , MedicalRecord medicalRecord , Patient patient) {}

}
