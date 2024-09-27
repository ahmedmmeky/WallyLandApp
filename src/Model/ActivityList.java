/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author meky
 */
public class ActivityList {

    private List<Activity> activityList = new ArrayList<>();
    private Activity activity;

    public ActivityList() {
        setFirstWorkout();
        buildWorkoutList();
        printWorkoutList();
    }

    public void setFirstWorkout() {
        String activityName = "King Da Ka";
        int capactity = 200;
        String description = "The fastest and tallest roller coaster in the world";
        activity = new Activity(activityName, capactity, description);
    }

    public void buildWorkoutList() {
        this.activityList.add(new Activity("Nitro",
                300, "A fast and fun roller coaster"));
        this.activityList.add(activity);

    }

    public void printWorkoutList() {
        for (Activity activity : activityList) {
            System.out.println(activity.toString());
        }
    }

    public void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    @Override
    public String toString() {
        return "ActivityList{" + "activityList=" + activityList + '}';
    }

}
