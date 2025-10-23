package com.clinicaspringbootcasas.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table (name = "professionalcards")
public class ProfessionalCard {
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Integer id;
    private String cardNumber;
    private LocalDate issueDate;
    private String issuingEntity;
    private LocalDate expirationDate;
    private String issueCity;
    private String country;
    private String state;
    private String category;
    private String associatedSpecialty;

    @OneToOne(mappedBy = "professionalCard")
    private Doctor doctor;

    public ProfessionalCard() {
    }

    public ProfessionalCard(Integer id, String cardNumber, LocalDate issueDate, String issuingEntity, LocalDate expirationDate, String issueCity, String country, String state, String category, String associatedSpecialty) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.issuingEntity = issuingEntity;
        this.expirationDate = expirationDate;
        this.issueCity = issueCity;
        this.country = country;
        this.state = state;
        this.category = category;
        this.associatedSpecialty = associatedSpecialty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssuingEntity() {
        return issuingEntity;
    }

    public void setIssuingEntity(String issuingEntity) {
        this.issuingEntity = issuingEntity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getIssueCity() {
        return issueCity;
    }

    public void setIssueCity(String issueCity) {
        this.issueCity = issueCity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAssociatedSpecialty() {
        return associatedSpecialty;
    }

    public void setAssociatedSpecialty(String associatedSpecialty) {
        this.associatedSpecialty = associatedSpecialty;
    }
}
