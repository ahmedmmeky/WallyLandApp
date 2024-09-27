/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestHarness;

import Controller.AdminNavigationController;
import Controller.NavigationController;
import Model.Activity;
import Model.Timeslot;
import View.AdminNavigation;
import View.NavigationUI;

/**
 *
 * @author meky
 */
public class ActivityTestHarness {

    Timeslot firstMorning = new Timeslot("8:00am", "8:30am");

    Activity nitro = new Activity("Nitro", 200, "Roller coaster ride", firstMorning);

    // Admin Navigation interface and logic
    AdminNavigationController adminNavCntrl = new AdminNavigationController();
    AdminNavigation adminNavUI = new AdminNavigation(adminNavCntrl);

    public void testModelActivity() {

        System.out.println(firstMorning.getStartTime());

        System.out.println(firstMorning.getEndTime());

        firstMorning.setStartTime("9:00am");

        firstMorning.setEndTime("9:30am");

        System.out.println(firstMorning.getStartTime());

        System.out.println(firstMorning.getEndTime());

        System.out.println(nitro.getCapacity());

        System.out.println(nitro.getDescription());

        System.out.println(nitro.getName());

        System.out.println(nitro.getTimeslot());

        System.out.println(nitro.toString());

    }

    // Package -> Controller -> AdminNavigationController
    public void ACTestStubs() {
        boolean connectStatus = adminNavCntrl.connectedUserClient(adminNavUI);
        System.out.println("  AdminNavigationController.connectUserClient output: " + connectStatus);
    }

    // Package -> View -> AdminNavigationUI
    public void ANUITestStubs() {
        boolean boolStatus = adminNavUI.connectedRestServer(adminNavCntrl);
        System.out.println("  AdminNavigationUI.connectRestServer output: " + boolStatus);
    }

}
