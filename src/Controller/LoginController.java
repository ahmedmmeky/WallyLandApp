package Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.NavigationUI;
import View.RegistrationUI;
import View.LoginPage;

/**
 *
 * @author fdadebo
 */
public class LoginController implements ActionListener {

    private NavigationController navCntrl;
    private AdminNavigationController adminNavCntrl;
    private LoginPage loginUI;
    private LoginController loginCntrl;
    private RegistrationController registraCntrl;
    private boolean act;

    /**
     * Constructor for login controller
     */
    public LoginController() {
        loginUI = new LoginPage(this);
        loginUI.loginButton.addActionListener(this);
        loginUI.adminLogin.addActionListener(this);
        loginUI.signUpButtonL.addActionListener(this);
        act = true;
        loginUI.setVisible(true);
    }

    ;
    
    /**
     * Method to 'connect' to our user
     * @param loginInterface a user interface which can view the login
     * @return the connection status
     */    
    public boolean connectedUserClient(LoginPage loginInterface) {
        loginUI = loginInterface;
        return true;
    }

    public boolean isAct() {
        return act;
    }

    public void setAct(boolean act) {
        this.act = act;
    }

    /**
     * Action Events for buttons
     *
     * @param e representing an Action Event returns void
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        System.out.println(isAct());
        /*        if(obj == loginUI.loginButton && isAct())
//        {
//            System.out.println("test");
//           navCntrl = new NavigationController();
//           loginUI.setVisible(false);
>>>>>>> 723d179af80c78c0860f2e71b0440a8856a2202b
//        } else */
        if (obj == loginUI.adminLogin) {

        } else if (obj == loginUI.adminLogin) {
            adminNavCntrl = new AdminNavigationController();
            loginUI.setVisible(false);
        }/*else if (obj == loginUI.signUpButtonL){
//            registraCntrl = new RegistrationController();
//            loginUI.setVisible(false);*/
//            
    }
}
/*        if(obj == loginUI.loginButton && isAct())
//        {
//            System.out.println("test");
//           navCntrl = new NavigationController();
//           loginUI.setVisible(false);
<<<<<<< HEAD (0cbb1ed) - Login Getter

=======
//        } else */
//        if (obj == loginUI.adminLogin) {
//
//        } else if (obj == loginUI.adminLogin) {
//            adminNavCntrl = new AdminNavigationController();
//            loginUI.setVisible(false);
//        }/*else if (obj == loginUI.signUpButtonL){
////            registraCntrl = new RegistrationController();
////            loginUI.setVisible(false);*/
//      

