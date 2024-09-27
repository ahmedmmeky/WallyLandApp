/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jfields
 */
public class Reservation {

    private ArrayList<Activity> activityList;
    private String activity;
    private int numGuests;
    private Timeslot time;
    private String date;

    /**
     * Constructor for Reservation
     *
     * @param activityList an ArrayList of the available Activities
     * @param activity a String with the name of the chosen activity
     * @param numGuests an integer of the number of guests for the reservation
     * @param time a TimeSlot object with the time of the reservation
     * @param date a String containing the date of the reservation
     */
    public Reservation(ArrayList<Activity> activityList, String activity, int numGuests, Timeslot time, String date) {
        this.activityList = activityList;
        this.activity = activity;
        this.numGuests = numGuests;
        this.time = time;
        this.date = date;
    }

    /**
     * Default Constructor for Reservation
     */
    public Reservation() {
        this.activityList = new ArrayList<>();
        this.activity = "";
        this.numGuests = 0;
        this.time = new Timeslot("", "");
        this.date = "";
    }

    /**
     * getter for list of Activities
     *
     * @return activityList (an ArrayList of activities)
     */
    public ArrayList<Activity> getActivityList() {
        return activityList;
    }

    /**
     * getter for type of activity
     *
     * @return activity (a String of the activity's name)
     */
    public String getActivity() {
        return activity;
    }

    /**
     * setter for the type of activity
     *
     * @param activity sets the String variable for activity name
     */
    public void setActivity(String activity) {
        this.activity = activity;
    }

    /**
     * getter for the number of guests
     *
     * @return numGuests (an int for number of guests for reservation)
     */
    public int getNumGuests() {
        return numGuests;
    }

    /**
     * setter for number of guests
     *
     * @param numGuests sets the int value with the number of guests
     */
    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    /**
     * getter for time
     *
     * @return time (a TimeSlot object that stores the available times)
     */
    public Timeslot getTime() {
        return time;
    }

    /**
     * setter for time
     *
     * @param time sets the TimeSlot value the desired time
     */
    public void setTime(Timeslot time) {
        this.time = time;
    }

    /**
     * getter for date
     *
     * @return date (a String of the reservation's date)
     */
    public String getDate() {
        return date;
    }

    /**
     * setter for date
     *
     * @param date sets the String variable for reservation's date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Method to submit Reservation
     */
    public void submitReservation() {

    }

    @Override
    public String toString() {
        return "Reservation{" + "activity=" + activity + ", numGuests=" + numGuests + ", time=" + time + ", date=" + date + '}';
    }

}
