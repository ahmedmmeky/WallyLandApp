/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Activity;
import Model.ActivityList;
import Model.ActivityTableModel;
import View.ManageActivityUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author meky
 */
public class ManageActivityController implements ActionListener {

    private ManageActivityUI manageActivityUI;
    private AdminNavigationController adminNavCntl;
    private ActivityTableModel activityTableModel;
    private ActivityList activityList;

    public ManageActivityUI getManageActivityUI() {
        return manageActivityUI;
    }

    public void setManageActivityListUI(ManageActivityUI manageActivityUI) {
        this.manageActivityUI = manageActivityUI;
    }

    public ManageActivityController() {
        activityList = new ActivityList();
        activityTableModel = new ActivityTableModel(activityList.getActivityList());
        manageActivityUI = new ManageActivityUI(this);
        manageActivityUI.backBtn.addActionListener(this);
        manageActivityUI.setVisible(true);
    }

    public ActivityTableModel getActivityTableModel() {
        return activityTableModel;
    }

    public void setActivityTableModel(ActivityTableModel activityTableModel) {
        this.activityTableModel = activityTableModel;
    }

    public void addToActivityTableModel(Activity activity) {
        List<Activity> activityList = this.getActivityList().getActivityList();
        activityList.add(activity);
        activityTableModel = new ActivityTableModel(activityList);
    }

    public ActivityList getActivityList() {
        return activityList;
    }

    public void setActivityList(ActivityList activityList) {
        this.activityList = activityList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == manageActivityUI.backBtn) {
            adminNavCntl = new AdminNavigationController();
            manageActivityUI.setVisible(false);
        }
    }

}
