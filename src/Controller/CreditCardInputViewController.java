package Controller;

import Model.Ticket;
import Model.User;
import View.CreditCardInputView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * this will control the purchase gui
 *
 * @author hayde
 */
public class CreditCardInputViewController implements ActionListener {

    private CreditCardInputView purchaseTix;
    private ViewTicketsController viewTix;
    private NavigationController navCntrl;
    private TicketsOrderController ticketOrders;

    //need a user
    private ArrayList<Ticket> orderedTicketList;
    private Double orderTotal;
    private JFrame warningFrame = new JFrame("Warning Frame");

    public CreditCardInputViewController(NavigationController navCntrl, TicketsOrderController ticketOrders, ArrayList<Ticket> orderedTickets) {
        this.navCntrl = navCntrl;
        this.ticketOrders = ticketOrders;
        this.orderedTicketList = orderedTickets;

        //need a user
        purchaseTix = new CreditCardInputView();
        purchaseTix.myTicketsBuy.addActionListener(this);
        purchaseTix.submitBuyTickets.addActionListener(this);
        purchaseTix.menuBtn.addActionListener(this);
        purchaseTix.setVisible(true);
        //System.out.println("pre-order");
        setOrderTotal();

    }

    public void setOrderTotal() {
        //System.out.println("In orders");
        double orderTotal = ticketOrders.getTicketOrders();
        System.out.println(orderTotal);
        purchaseTix.setTicketOrderTotal(orderTotal);
    }

    public void writeTicketListToJson(ArrayList<Ticket> orders, User currentUser) {

        JSONArray ticketsToWrite = new JSONArray();

        for (Ticket t : orders) {
            JSONObject currentTicket = new JSONObject();
            JSONObject ticketDetails = new JSONObject();

            ticketDetails.put("ID", t.getId());
            ticketDetails.put("User", currentUser);
            ticketDetails.put("Type", t.getType());
            ticketDetails.put("Purchase Date", t.getStartDate());
            ticketDetails.put("Exp Date", t.getExpDate());
            ticketDetails.put("Price", t.getPrice());

            currentTicket.put("ticket", ticketDetails);
            ticketsToWrite.add(currentTicket);
        }

        try (FileWriter file = new FileWriter("tickets.json")) {
            file.write(ticketsToWrite.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * getter for purchased tickets
     *
     * @return (gets purchased tickets)
     */
    public CreditCardInputView getPurchaseTix() {
        return purchaseTix;
    }

    /**
     * setter for purchase tickets
     *
     * @param purchaseTix sets variable of purchase tickets type
     */
    public void setPurchaseTix(CreditCardInputView purchaseTix) {
        this.purchaseTix = purchaseTix;
    }

    /**
     * getter for view tickets controller
     *
     * @return (gets an instance of the view tickets controller)
     */
    public ViewTicketsController getViewTix() {
        return viewTix;
    }

    /**
     * setter for view tickets
     *
     * @param viewTix sets variable of ViewTicketsController type
     */
    public void setViewTix(ViewTicketsController viewTix) {
        this.viewTix = viewTix;
    }

    /**
     * Action Events for buttons
     *
     * @param e the command line arguments
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == purchaseTix.myTicketsBuy) {
            viewTix = new ViewTicketsController(navCntrl);
            purchaseTix.setVisible(false);
        } else if (obj == purchaseTix.submitBuyTickets) {
            if (purchaseTix.creditCardField.getText().length() != 16) {
                JOptionPane.showMessageDialog(warningFrame, "Please Enter a Valid Credit Card Number");
            } else if (purchaseTix.ccvField.getText().length() != 3) {
                JOptionPane.showMessageDialog(warningFrame, "Please Enter a Valid CCV Number");
            } else if (purchaseTix.expField.getText().length() != 5) {
                JOptionPane.showMessageDialog(warningFrame, "Please Enter a Valid EXP Date");
            } else {
                navCntrl = new NavigationController();
                purchaseTix.setVisible(false);
            }
        } else if (obj == purchaseTix.menuBtn) {
            navCntrl = new NavigationController();
            purchaseTix.setVisible(false);
        }

    }

    public boolean connectedUserClient(CreditCardInputView purchaseUI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
