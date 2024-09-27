/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.AdminNavigation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author meky
 */
public class AdminNavigationController implements ActionListener {

    private AdminNavigation adminNavUI;
    // private CreateActivityUI createActivityUI;
    private CreateActivityController createActivityCntl;
    //private LoginController loginCntrl;
    private ManageActivityController manageActivityCntl;
    private LoginController loginCntl;

    /**
     * Constructor for the Navigation Controller used to instantiate aspects of
     * the controller
     */
    public AdminNavigationController() {
        adminNavUI = new AdminNavigation();
        adminNavUI.createActivityBtn.addActionListener(this);
        adminNavUI.manageActivitiesBtn.addActionListener(this);
        adminNavUI.backBtn.addActionListener(this);
        adminNavUI.setVisible(true);
    }

    /**
     * Method to 'connect' to our user
     *
     * @param navInterface a user interface which can view the main menu
     * @return the connection status
     */
    public boolean connectedUserClient(AdminNavigation navInterface) {
        adminNavUI = navInterface;
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == adminNavUI.createActivityBtn) {
            createActivityCntl = new CreateActivityController();
            adminNavUI.setVisible(false);
        } else if (obj == adminNavUI.manageActivitiesBtn) {
            manageActivityCntl = new ManageActivityController();
            adminNavUI.setVisible(false);
        } else if (obj == adminNavUI.backBtn) {
            loginCntl = new LoginController();
        }
    }

}
