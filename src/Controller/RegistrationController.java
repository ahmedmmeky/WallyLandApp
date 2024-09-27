/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.NavigationUI;
import View.LoginPage;
import View.RegistrationUI;

/**
 *
 * @author felixdadebo
 */
public class RegistrationController implements ActionListener {

    private NavigationController navCntrl;
    private RegistrationController registrationController;
    private RegistrationUI registrationUI;

    //private RegistrationController loginCntrl;
    /**
     * Constructor for the REgistration Controller used to instantiate aspects
     * of the controller
     */
    public RegistrationController() {
        registrationUI = new RegistrationUI(this);
        registrationUI.SignUp1.addActionListener(this);
        registrationUI.setVisible(true);

    }

    public boolean connectedUserClient(RegistrationUI navInterface) {
        registrationUI = navInterface;
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == registrationUI.SignUp1) {
            navCntrl = new NavigationController();
            registrationUI.setVisible(false);

        }

    }
}
