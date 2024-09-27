package Controller;

import Model.Restaurants;
import View.RestaurantMenuUI;
import View.RestaurantOrderUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author bpardee
 */
public class RestaurantOrderController implements ActionListener {

    private NavigationController navCntrl;
    private Restaurants restaurant;
    private RestaurantOrderUI orderUI;
    private RestaurantController menuCntrl;

    /**
     * Constructor for the restaurant ordering
     *
     * @param restCntrl references the Restaurant Controller class
     */
    public RestaurantOrderController(RestaurantController restCntrl) {
        this.navCntrl = navCntrl;
        restaurant = new Restaurants();
        menuCntrl = restCntrl;
        orderUI = new RestaurantOrderUI(this, restaurant);
        orderUI.backBtn.addActionListener(this);
        orderUI.orderBtn.addActionListener(this);
        orderUI.setVisible(true);
        setOrderTotal();
    }

    /**
     * sets order total
     */
    public void setOrderTotal() {
        orderUI.setOrderTotalAmt(menuCntrl.getMenuItemAmts());
    }

    /**
     * Method to 'connect' to our user
     *
     * @param orderInterface a user interface which can place an order
     * @return the connection status
     */
    public boolean connectedUserClient(RestaurantOrderUI orderInterface) {
        orderUI = orderInterface;
        return true;
    }

    /**
     * Action Events for buttons
     *
     * @param e represents an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == orderUI.backBtn) {
            menuCntrl = new RestaurantController(navCntrl);
            orderUI.setVisible(false);
        }
        if (obj == orderUI.orderBtn) {
            boolean verified = true;
            if (orderUI.getCardNumberValue().getText().equals("") || orderUI.getCardNumberValue().getText().equals("**Required**")) {
                orderUI.setCardNumberValue("**Required**");
                verified = false;
            }
            if (orderUI.getCvvValue().getText().equals("") || orderUI.getCvvValue().getText().equals("**Required**")) {
                orderUI.setCvvValue("**Required**");
                verified = false;
            }
            if (orderUI.getExpirationValue().getText().equals("") || orderUI.getExpirationValue().getText().equals("**Required**")) {
                orderUI.setExpirationValue("**Required**");
                verified = false;
            }
            if (verified) {
                navCntrl = new NavigationController();
                orderUI.setVisible(false);
            }
        }
    }

}
