package TestHarness;

import Controller.CreditCardInputViewController;
import Controller.ViewTicketsController;
import Controller.RestaurantOrderController;
import Model.Restaurants;
import Model.AdminModel;
import View.ViewTickets;
import View.CreditCardInputView;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hayde
 */
public class PurchasingTestHarness {

    // purchase interface
    CreditCardInputViewController purCntl = new CreditCardInputViewController();
    CreditCardInputView purchaseUI = new CreditCardInputView();

    // view interface
    ViewTicketsController viewCntl = new ViewTicketsController();
    ViewTickets viewUI = new ViewTickets();

    // Restaurant Ordering (menu and order) - create interface and logic
    ViewTicketModel viewThem = new ViewTicketModel();
    PurchaseModel purchaseSome = new PurchaseModel();

    // Package -> Controller -> CreditCardInputViewController test stubs
    public void PTTestStubs() {
        boolean connectStatus = purCntl.connectedUserClient(purchaseUI);
        System.out.println("  purchaseTicketsController.connectUserClient output: " + connectStatus);
    }

    // Package -> Controller -> ViewTicketsController
    public void VTTestStubs() {
        boolean connectStatus = viewCntl.connectedUserClient(viewUI);
        System.out.println("  viewTicketsController.connectUserClient output: " + connectStatus);
    }

    // Package -> View -> viewTixUI
    public void PTUITestStubs() {
        boolean boolStatus = viewUI.connectedRestServer(purCntl);
        System.out.println("  purchaseTicketsUI.connectRestServer output: " + boolStatus);
    }

    // Package -> View -> PurchaseTixUI
    public void VTITestStubs() {
        boolean boolStatus = purchaseUI.connectedRestServer(viewCntl);
        System.out.println("  viewTicketsUI.connectRestServer output: " + boolStatus);
    }

}

public void PMTestStubs() {
        System.out.println("  Testing purchaseModel Class -> setPrice with 2321");
        purchaseSome.setPrice(2321);
        System.out.println("Getting price of ticket: " + purchaseSome.getPrice());
    }

}
