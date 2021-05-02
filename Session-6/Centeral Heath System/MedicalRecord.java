public class MedicalRecord {
    private String sickness;
    private Patient patient;
    private Physician physician;
    private String patientHistory;
    private String physicianDiagnosis;
    private int diseaseSecurityLevel;
    private String prescribedDrug;
    private Date date;

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

    public String getSickness() {
        return sickness;
    }

    public Patient getPatient() {
        return patient;
    }

    public Physician getPhysician() {
        return physician;
    }

    public String getPatientHistory() {
        return patientHistory;
    }

    public String getPhysicianDiagnosis() {
        return physicianDiagnosis;
    }

    public int getDiseaseSecurityLevel() {
        return diseaseSecurityLevel;
    }

    public String getPrescribedDrug() {
        return prescribedDrug;
    }

    public Date getDate() {
        return date;
    }
}

