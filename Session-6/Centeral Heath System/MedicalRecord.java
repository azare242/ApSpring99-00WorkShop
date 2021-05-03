/**
 * a class for medical records
 */
public class MedicalRecord {
    /**
     * Fields
     */
    private String sickness;
    private Patient patient;
    private Physician physician;
    private String patientHistory;
    private String physicianDiagnosis;
    private int diseaseSecurityLevel;
    private String prescribedDrug;
    private Date date;

    /**
     * constructor
     */
    public MedicalRecord(String sickness, Patient patient, Physician physician, String patientHistory, String physicianDiagnosis, int diseaseSecurityLevel, String prescribedDrug, Date date) {
        this.sickness = sickness;
        this.patient = patient;
        this.physician = physician;
        this.patientHistory = patientHistory;
        this.physicianDiagnosis = physicianDiagnosis;
        this.diseaseSecurityLevel = diseaseSecurityLevel;
        this.prescribedDrug = prescribedDrug;
        this.date = date;
    }

    /**
     * get sickness
     */
    public String getSickness() {
        return sickness;
    }
    /**
     * get patient
     */
    public Patient getPatient() {
        return patient;
    }
    /**
     * get physician
     */
    public Physician getPhysician() {
        return physician;
    }
    /**
     * get patient history
     */
    public String getPatientHistory() {
        return patientHistory;
    }
    /**
     * get Physician Diagnosis
     */
    public String getPhysicianDiagnosis() {
        return physicianDiagnosis;
    }
    /**
     * get Disease Security Level
     */
    public int getDiseaseSecurityLevel() {
        return diseaseSecurityLevel;
    }
    /**
     * get Prescribed Drug
     */
    public String getPrescribedDrug() {
        return prescribedDrug;
    }
    /**
     * get date
     */
    public Date getDate() {
        return date;
    }
}

