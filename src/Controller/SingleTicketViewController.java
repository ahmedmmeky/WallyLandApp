package Controller;

import Controller.CreditCardInputViewController;
import Controller.SingleTicketViewController;
import View.SingleTicketView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hayde
 */
public class SingleTicketViewController implements ActionListener {//will grab tickets based on a verified user and control from here

    private NavigationController navCntrl;
    private ViewTicketsController viewTixCntl;
    private SingleTicketView singleViewUI;

    /**
     * Constructor for the view tickets controller class
     *
     * @param navCntrl instance of the navigation controller
     * @param purchaseTicketsCntrl instance of the purchase tickets controller
     */
    public SingleTicketViewController(NavigationController navCntrl, ViewTicketsController viewTixCntl) {
        this.navCntrl = navCntrl;
        this.viewTixCntl = viewTixCntl;
        singleViewUI = new SingleTicketView();
        singleViewUI.menuBtn.addActionListener(this);
        singleViewUI.setVisible(true);
    }

    public void setTicketValues(String id, String user, String type, String purchaseDate, String expDate, Double price) {
        singleViewUI.setIdField(id);
        singleViewUI.setUserField(user);
        singleViewUI.setTicketTypeField(type);
        singleViewUI.setDatePurchasedField(purchaseDate);
        singleViewUI.setExpDateField(expDate);
        singleViewUI.setPriceField(price);
    }

    /**
     * Action Events for buttons
     *
     * @param e representing an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == singleViewUI.menuBtn) {
            navCntrl = new NavigationController();
            singleViewUI.setVisible(false);
        } else if (obj == singleViewUI.backBtn) {
            viewTixCntl = new ViewTicketsController(navCntrl);
            singleViewUI.setVisible(false);
        }
    }

    public boolean connectedUserClient(SingleTicketView singleUI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
