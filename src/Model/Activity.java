/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author meky
 *
 * Activity class for park administrators to create park activity objects
 */
public class Activity {

    private String name;
    private int capacity;
    private String description;
    private Timeslot timeslot;

    /**
     * constructor for activity class
     *
     * @param name name of activity
     * @param capacity capacity of activity
     * @param description description of activity
     * @param timeslot time slot of activity
     */
    public Activity(String name, int capacity, String description, Timeslot timeslot) {
        this.name = name;
        this.capacity = capacity;
        this.description = description;
        this.timeslot = timeslot;
    }

    public Activity(String name, int capacity, String description) {
        this.name = name;
        this.capacity = capacity;
        this.description = description;
    }

    /**
     *
     * @return get the name of a park activity
     */
    /**
     *
     * @return get the name of a park activity
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name the name of the park activity
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return get the capacity of a park activity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @param capacity the capacity of the park activity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return get the description of a park activity
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description the description of the park activity
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return get the timeslot of a park activity
     */
    public Timeslot getTimeslot() {
        return timeslot;
    }

    /**
     *
     * @param timeslot the timeslot of the park activity
     */
    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    /**
     *
     * @return string format of the activity
     */
    @Override
    public String toString() {
        return "Activity{" + "name=" + name + ", capacity=" + capacity + ", description=" + description;
    }

}
