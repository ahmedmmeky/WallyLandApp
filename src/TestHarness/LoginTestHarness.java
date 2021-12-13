package TestHarness;

import Controller.LoginController;
import Model.User;
import View.LoginPage;

/**
 *
 * @author Felix
 */
public class LoginTestHarness {

    User user = new User();
    LoginController loginCntrl = new LoginController();
    LoginPage loginUI = new LoginPage(loginCntrl);

    // Package -> Model -> User Test Stubs
    public void UserTests() {
        System.out.println("  Testing User Class -> setEmail");
        user.setEmail("test@psu.edu");
        System.out.println("  Testing User Class -> getEmail " + user.getEmail());

        System.out.println("  Testing User Class -> setFirstName");
        user.setFirstName("John");
        System.out.println("  Tesing User Class -> getFirstName" + user.getFirstName());

        System.out.println("  Testing User Class -> setLastName");
        user.setLastName("Doe");
        System.out.println("  Testing User Class -> getLastName" + user.getLastName());

        System.out.println("  Testing User Class -> setPassword");
        user.setPassword("1234");
        System.out.println("  Testing User Class -> getPassword" + user.getPassword());
    }

    // Package -> Controller -> LoginController Test Stubs
    public void LCTestStubs() {
        boolean connectStatus = loginCntrl.connectedUserClient(loginUI);
        System.out.println("  AdminNavigationController.connectUserClient output: " + connectStatus);
    }

    // Package -> View -> LoginPage Test Stubs
    public void LPTestStubs() {
        boolean boolStatus = loginUI.connectedRestServer(loginCntrl);
        System.out.println("  AdminNavigationUI.connectRestServer output: " + boolStatus);
    }
}
