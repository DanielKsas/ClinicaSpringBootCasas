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
    private String localDateBirth;
    private String gender;
    private String bloodType;

    @OneToOne(mappedBy = "patient")
    private ClinicalHistory clinicalHistory;


    public Patient() {
  }

  public Patient(Integer id, String fullName, String documentType, String documentNumber, String address, String email, String localDateBirth, String gender, String bloodType) {
    this.id = id;
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.address = address;
    this.email = email;
    this.localDateBirth = localDateBirth;
    this.gender = gender;
    this.bloodType = bloodType;
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

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public String getLocalDateBirth() {
    return localDateBirth;
  }

  public String getGender() {
    return gender;
  }

  public String getBloodType() {
    return bloodType;
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

  public void setAddress(String address) {
    this.address = address;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setLocalDateBirth(String localDateBirth) {
    this.localDateBirth = localDateBirth;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
  }
}
