/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author Hayden
 */
public abstract class Ticket {

    protected double price;
    protected UUID Id;
    protected LocalDate startDate = LocalDate.now();
    protected int daysActive;
    protected LocalDate expDate = startDate.plusDays(daysActive);
    protected String type;

    public Ticket(/*double price, boolean paid, UUID Id, LocalDate startDate, int daysActive, LocalDate expDate, String type*/) {
//        this.price = price;
//        this.paid = paid;
//        this.Id = Id;
//        this.startDate = startDate;
//        this.daysActive = daysActive;
//        this.expDate = expDate;
//        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID Id) {
        this.Id = Id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public int getDaysActive() {
        return daysActive;
    }

    public void setDaysActive(int daysActive) {
        this.daysActive = daysActive;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
