package TestHarness;

import Model.Activity;
import Model.Reservation;
import Model.Timeslot;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author bpardee
 */
public class ReservationTestHarness {

    Timeslot time = new Timeslot("1:00pm", "1:30pm");
    Activity act = new Activity("Ferris Wheel", 30, "a ride", time);
    Reservation res = new Reservation(new ArrayList<Activity>(Arrays.asList(act)), "Ferris Wheel", 2, time, "07/23/2022");

    // Package -> Model -> Reservation Test Stubs
    public void ResTestStubs() {
        System.out.println("  Testing Reservation Class -> getActivityList " + res.getActivityList());
        System.out.println("  Testing Reservation Class -> getActivity " + res.getActivity());
        System.out.println("  Testing Reservation Class -> getNumGuests " + res.getNumGuests());
        System.out.println("  Testing Reservation Class -> getTime " + res.getTime());
        System.out.println("  Testing Reservation Class -> getDate " + res.getDate());
    }

}
