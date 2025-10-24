package com.clinicaspringbootcasas.modelos;

import jakarta.persistence.*;

@Entity
@Table (name="patients")
public class Patient {
@Id
@GeneratedValue(strategy =
GenerationType.IDENTITY)

    private Integer id;
    private String fullName;
    private String documentType;
    private String documentNumber;
    private String address;
    private String email;
    private String dateBirth;
    private String gender;
    private String bloodType;
    private String phoneNumber;

    @OneToOne(mappedBy = "patient")
    private ClinicalHistory clinicalHistory;


    public Patient() {
  }

  public Patient(Integer id, String fullName, String documentType, String documentNumber, String address, String email, String dateBirth, String gender, String bloodType, String phoneNumber, ClinicalHistory clinicalHistory) {
    this.id = id;
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.address = address;
    this.email = email;
    this.dateBirth = dateBirth;
    this.gender = gender;
    this.bloodType = bloodType;
    this.phoneNumber = phoneNumber;
    this.clinicalHistory = clinicalHistory;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDateBirth() {
    return dateBirth;
  }

  public void setDateBirth(String dateBirth) {
    this.dateBirth = dateBirth;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getBloodType() {
    return bloodType;
  }

  public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ClinicalHistory getClinicalHistory() {
    return clinicalHistory;
  }

  public void setClinicalHistory(ClinicalHistory clinicalHistory) {
    this.clinicalHistory = clinicalHistory;
  }
}
