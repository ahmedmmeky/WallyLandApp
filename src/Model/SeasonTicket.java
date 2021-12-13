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
 * @author hayde
 */
public class SeasonTicket extends Ticket {

    private double price = 499.99;
    private int daysActive = 80;
    private String type = "Season";

    public SeasonTicket(/*double price, boolean paid, UUID Id, LocalDate startDate, int daysActive, LocalDate expDate, String type*/) {
        //super(price, paid, Id, startDate, daysActive, expDate, type);
//        this.price = price;
//        this.daysActive = daysActive;
//        this.type = type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getDaysActive() {
        return daysActive;
    }

    @Override
    public void setDaysActive(int daysActive) {
        this.daysActive = daysActive;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

}
