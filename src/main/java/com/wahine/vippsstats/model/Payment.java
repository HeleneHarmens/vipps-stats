package com.wahine.vippsstats.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment", schema = "public")
public class Payment {
    private int customerID;
    private int senderID;
    private int receiverID;
    private String messageCreatedOn;
    private String messageCreatedBy;
    private String messageStatus;
    private String docType;
    private int transactionID;
    private String currency;
    private int amount;
    private String isRequest;
    private String receiverType;

    public Payment() {

    }

    public Payment(int customerID, int senderID, int receiverID, String messageCreatedOn, String messageCreatedBy, String messageStatus, String docType,
                   int transactionID, String currency, int amount, String isRequest, String receiverType) {
        this.customerID = customerID;
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.messageCreatedOn = messageCreatedOn;
        this.messageCreatedBy = messageCreatedBy;
        this.messageStatus = messageStatus;
        this.docType = docType;
        this.transactionID = transactionID;
        this.currency = currency;
        this.amount = amount;
        this.isRequest = isRequest;
        this.receiverType = receiverType;
    }


    @Column(name = "customer_id", nullable = false)
    public int getcustomerID() {
        return customerID;
    }

    public void setcustomerID(int customerID) {
        this.customerID = customerID;
    }

    @Column(name = "sender_id", nullable = true)
    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    @Column(name = "receiver_id", nullable = true)
    public int getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    @Column(name = "message_created_on", nullable = true)
    public String getMessageCreatedOn() {
        return messageCreatedOn;
    }

    public void setMessageCreatedOn(String messageCreatedOn) {
        this.messageCreatedOn = messageCreatedOn;
    }

    @Column(name = "message_created_by", nullable = true)
    public String getMessageCreatedBy() {
        return messageCreatedBy;
    }

    public void setMessageCreatedBy(String messageCreatedBy) {
        this.messageCreatedBy = messageCreatedBy;
    }

    @Column(name = "message_status", nullable = true)
    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    @Column(name = "doc_type", nullable = true)
    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    @Id
    @Column(name = "transaction_id", nullable = true)
    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    @Column(name = "currency", nullable = true)
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Column(name = "amount", nullable = true)
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Column(name = "is_request", nullable = true)
    public String getIsRequest() {
        return isRequest;
    }

    public void setIsRequest(String isRequest) {
        this.isRequest = isRequest;
    }

    @Column(name = "receiver_type", nullable = true)
    public String getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(String receiverType) {
        this.receiverType = receiverType;
    }
}
