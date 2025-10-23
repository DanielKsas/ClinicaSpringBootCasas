package com.clinicaspringbootcasas.modelos;

import jakarta.persistence.*;


@Entity
@Table (name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private String documentType;
    private String documentNumber;
    private String specialty;
    private String phone;
    private String email;
    private String AttentionSchedule;
    private String office;
    private String experience;

    @OneToOne
    @JoinColumn(name = "professional_card_id")
    private ProfessionalCard professionalCard;
    public Doctor() {
    }

    public Doctor(Integer id, String fullName, String documentType, String documentNumber, String specialty, String phone, String email, String attentionSchedule, String office, String experience) {
        this.id = id;
        this.fullName = fullName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.specialty = specialty;
        this.phone = phone;
        this.email = email;
        AttentionSchedule = attentionSchedule;
        this.office = office;
        this.experience = experience;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAttentionSchedule() {
        return AttentionSchedule;
    }

    public String getOffice() {
        return office;
    }

    public String getExperience() {
        return experience;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAttentionSchedule(String attentionSchedule) {
        AttentionSchedule = attentionSchedule;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
