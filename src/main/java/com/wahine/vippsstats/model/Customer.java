package com.wahine.vippsstats.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer", schema = "public")
public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String mobileNumber;
    private String ssn;
    private String dob;
    private String languageCode;
    private String createdAt;
    private String updatedOn;
    private String lastLoginDT;
    private int Status;


    public Customer() {

    }

    public Customer(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public Customer(int customerId, String firstName, String lastName, String emailId) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public Customer(int customerId, String firstName, String lastName, String emailId, String mobileNumber, String ssn, String dob, String languageCode, String createdAt, String updatedOn, String lastLoginDT, int status) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.ssn = ssn;
        this.dob = dob;
        this.languageCode = languageCode;
        this.createdAt = createdAt;
        this.updatedOn = updatedOn;
        this.lastLoginDT = lastLoginDT;
        Status = status;
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Column(name = "first_name", nullable = true)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = true)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email_id", nullable = true)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Column(name = "mobile_number", nullable = true)
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Column(name = "dob", nullable = true)
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    @Column(name = "ssn", nullable = true)
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Column(name = "language_code", nullable = true)
    public String getLanguageCode() {
        return languageCode;
    }
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Column(name = "created_at", nullable = true)
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Column(name = "updated_on", nullable = true)
    public String getUpdatedOn() {
        return updatedOn;
    }
    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Column(name = "last_login_dt", nullable = true)
    public String getLastLoginDT() {
        return lastLoginDT;
    }
    public void setLastLoginDT(String lastLoginDT) {
        this.lastLoginDT = lastLoginDT;
    }

    @Column(name = "status", nullable = true)
    public int getStatus() {
        return Status;
    }
    public void setStatus(int status) {
        Status = status;
    }


    @Override
    public String toString() {
        return "Customer [" +
                "customer_id=" + customerId + ", " +
                "first_name=" + firstName + ", " +
                "last_name=" + lastName + ", " +
                "email_id=" + emailId + ", " +
                "dob=" + dob + ", " +
                "ssn=" + ssn + ", " +
                "mobile_number=" + mobileNumber + ", " +
                "language_code=" + languageCode + ", " +
                "created_at=" + createdAt + ", " +
                "updated_on=" + updatedOn + ", " +
                "last_login_dt=" + lastLoginDT + ", " +
                "status=" + Status
                + "]";
    }
}