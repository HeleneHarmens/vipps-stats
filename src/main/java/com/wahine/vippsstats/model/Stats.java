package com.wahine.vippsstats.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stats", schema = "public")
public class Stats {
    private int since_last_sent;
    private int since_last_received;
    private int total_amount_sent;
    private int total_amount_received;
    private int number_of_sent;
    private int number_of_received;
    private int amount_merchant;

    public Stats(){

    }

    public Stats(int since_last_sent, int since_last_received, int total_amount_sent, int total_amount_received, int number_of_sent, int number_of_received, int amount_merchant) {
        this.since_last_sent = since_last_sent;
        this.since_last_received = since_last_received;
        this.total_amount_sent = total_amount_sent;
        this.total_amount_received = total_amount_received;
        this.number_of_sent = number_of_sent;
        this.number_of_received = number_of_received;
        this.amount_merchant = amount_merchant;
    }

    public int getSince_last_sent() {
        return since_last_sent;
    }

    public void setSince_last_sent(int since_last_sent) {
        this.since_last_sent = since_last_sent;
    }

    public int getSince_last_received() {
        return since_last_received;
    }

    public void setSince_last_received(int since_last_received) {
        this.since_last_received = since_last_received;
    }

    public int getTotal_amount_sent() {
        return total_amount_sent;
    }

    public void setTotal_amount_sent(int total_amount_sent) {
        this.total_amount_sent = total_amount_sent;
    }

    public int getNumber_of_sent() {
        return number_of_sent;
    }

    public void setNumber_of_sent(int number_of_sent) {
        this.number_of_sent = number_of_sent;
    }

    public int getNumber_of_received() {
        return number_of_received;
    }

    public void setNumber_of_received(int number_of_received) {
        this.number_of_received = number_of_received;
    }

    public int getAmount_merchant() {
        return amount_merchant;
    }

    public void setAmount_merchant(int amount_merchant) {
        this.amount_merchant = amount_merchant;
    }

    public int getTotal_amount_received() {
        return total_amount_received;
    }

    public void setTotal_amount_received(int total_amount_received) {
        this.total_amount_received = total_amount_received;
    }
}
