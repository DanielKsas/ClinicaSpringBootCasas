package com.clinicaspringbootcasas.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table (name= "clinicalhistories")
public class ClinicalHistory {
    @Id
    @GeneratedValue(strategy =
    GenerationType.IDENTITY)
    private Integer id;
    private LocalDate creationDate;
    private String reasonForConsultation;
    private String diagnosis;
    private String treatment;
    private String allergies;
    private String medicalHistory;
    private String currentMedications;
    private String observations;
    private String patientStatus;


    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public ClinicalHistory() {
    }

    public ClinicalHistory(Integer id, LocalDate creationDate, String reasonForConsultation, String diagnosis, String treatment, String allergies, String medicalHistory, String currentMedications, String observations, String patientStatus) {
        this.id = id;
        this.creationDate = creationDate;
        this.reasonForConsultation = reasonForConsultation;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.allergies = allergies;
        this.medicalHistory = medicalHistory;
        this.currentMedications = currentMedications;
        this.observations = observations;
        this.patientStatus = patientStatus;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public String getReasonForConsultation() {
        return reasonForConsultation;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getCurrentMedications() {
        return currentMedications;
    }

    public String getObservations() {
        return observations;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setReasonForConsultation(String reasonForConsultation) {
        this.reasonForConsultation = reasonForConsultation;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setCurrentMedications(String currentMedications) {
        this.currentMedications = currentMedications;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }
}
