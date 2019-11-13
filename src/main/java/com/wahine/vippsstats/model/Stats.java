package com.wahine.vippsstats.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stats", schema = "public")
public class Stats {
    private int customerId;
    private int sinceLastSent;
    private int sinceLastReceived;
    private int totalAmountSent;
    private int totalAmountReceived;
    private int numberOfSent;
    private int numberOfReceived;
    private int amountMerchant;

    public Stats(){

    }

    public Stats(int customerId, int sinceLastSent, int sinceLastReceived, int totalAmountSent, int totalAmountReceived, int numberOfSent, int numberOfReceived, int amountMerchant) {
        this.customerId = customerId;
        this.sinceLastSent = sinceLastSent;
        this.sinceLastReceived = sinceLastReceived;
        this.totalAmountSent = totalAmountSent;
        this.totalAmountReceived = totalAmountReceived;
        this.numberOfSent = numberOfSent;
        this.numberOfReceived = numberOfReceived;
        this.amountMerchant = amountMerchant;
    }

    @Id
    @Column(name = "customer_id", nullable = false)
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Column(name = "since_last_sent", nullable = true)
    public int getSinceLastSent() {
        return sinceLastSent;
    }
    public void setSinceLastSent(int sinceLastSent) {
        this.sinceLastSent = sinceLastSent;
    }

    @Column(name = "since_last_received", nullable = true)
    public int getSinceLastReceived() {
        return sinceLastReceived;
    }
    public void setSinceLastReceived(int sinceLastReceived) {
        this.sinceLastReceived = sinceLastReceived;
    }

    @Column(name = "total_amount_sent", nullable = true)
    public int getTotalAmountSent() {
        return totalAmountSent;
    }
    public void setTotalAmountSent(int totalAmountSent) {
        this.totalAmountSent = totalAmountSent;
    }

    @Column(name = "total_amount_received", nullable = true)
    public int getTotalAmountReceived() {
        return totalAmountReceived;
    }
    public void setTotalAmountReceived(int totalAmountReceived) {
        this.totalAmountReceived = totalAmountReceived;
    }

    @Column(name = "number_of_sent", nullable = true)
    public int getNumberOfSent() {
        return numberOfSent;
    }
    public void setNumberOfSent(int numberOfSent) {
        this.numberOfSent = numberOfSent;
    }

    @Column(name = "number_of_received", nullable = true)
    public int getNumberOfReceived() {
        return numberOfReceived;
    }
    public void setNumberOfReceived(int numberOfReceived) {
        this.numberOfReceived = numberOfReceived;
    }

    @Column(name = "amount_merchant", nullable = true)
    public int getAmountMerchant() {
        return amountMerchant;
    }
    public void setAmountMerchant(int amountMerchant) {
        this.amountMerchant = amountMerchant;
    }

}
