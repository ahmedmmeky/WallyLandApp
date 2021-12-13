/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.AdminNavigation;
import View.CreateActivityUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Activity;
import Model.ActivityList;

/**
 *
 * @author meky
 */
public class CreateActivityController implements ActionListener {

    private CreateActivityUI createActivityUI;
    private AdminNavigationController adminNavCntrl;
    private ManageActivityController manageActivityCntl;
    //private LoginController loginCntrl;

    /**
     * Constructor for the Navigation Controller used to instantiate aspects of
     * the controller
     */
    public CreateActivityController() {
        createActivityUI = new CreateActivityUI(this);
        createActivityUI.cancelBtn.addActionListener(this);
        createActivityUI.saveButton.addActionListener(this);
        createActivityUI.setVisible(true);
    }

    /**
     * Method to 'connect' to our user
     *
     * @param navInterface a user interface which can view the main menu
     * @return the connection status
     */
    public boolean connectedUserClient(CreateActivityUI createActivityNav) {
        createActivityUI = createActivityNav;
        return true;
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == createActivityUI.cancelBtn) {
            adminNavCntrl = new AdminNavigationController();
            createActivityUI.setVisible(false);
        } else if (obj == createActivityUI.saveButton) {
            String activityName = createActivityUI.nameField.getText();
            int capacity = Integer.parseInt(createActivityUI.capacityField.getText());
            String description = createActivityUI.descriptionField.getText();
            Activity newActivity = new Activity(activityName, capacity, description);
            //ActivityList activityList = new ActivityList(); 
            //activityList.addActivity(newActivity);
            manageActivityCntl = new ManageActivityController();
            manageActivityCntl.addToActivityTableModel(newActivity);
            adminNavCntrl = new AdminNavigationController();
            createActivityUI.setVisible(false);
        }
    }

}
