/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author meky
 *
 * Used for administrators to add timeslots to an activity
 */
public class Timeslot {

    private String startTime;
    private String endTime;

    /**
     * constructor for time slot
     *
     * @param startTime string for start time
     * @param endTime string for end time
     */
    public Timeslot(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     *
     * @return start time of the timeslot
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     *
     * @param startTime edits the start time of an activity
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     *
     * @return end time of the timeslot
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     *
     * @param endTime edits the end time of an activity
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     *
     * @return string format of the timeslot
     */
    @Override
    public String toString() {
        return "Timeslot{" + "startTime=" + startTime + ", endTime=" + endTime + '}';
    }

}
