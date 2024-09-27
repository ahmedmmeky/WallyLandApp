package Controller;

import Model.Restaurants;
import View.NavigationUI;
import View.RestaurantMenuUI;
import View.RestaurantOrderUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;

/**
 *
 * @author bpardee
 */
public class RestaurantController implements ActionListener {

    private NavigationController navCntrl;
    private RestaurantMenuUI menuUI;
    private Restaurants restaurant;
    private RestaurantOrderController orderCntrl;

    /**
     * Constructor for restaurant menu
     *
     * @param navCntrl reference to the Navigation Controller class
     */
    public RestaurantController(NavigationController navCntrl) {
        this.navCntrl = navCntrl;
        restaurant = new Restaurants("Park Restaurant",
                new ArrayList<String>(Arrays.asList("Hamburger", "Cheeseburger", "Mac and Cheese", "Hot Dog", "Pulled Pork", "Nachos", "French Fries")),
                new ArrayList<Double>(Arrays.asList(4.99, 5.99, 4.99, 2.99, 5.99, 3.99, 2.99)),
                20);
        menuUI = new RestaurantMenuUI(this, restaurant);
        menuUI.reviewOrderBtn.addActionListener(this);
        menuUI.backBtn.addActionListener(this);
        menuUI.setVisible(true);
        setMenuValues();
    }

    /**
     * sets menu values based on restaurant created 7 food items, 7 prices, 1
     * menu title
     */
    public void setMenuValues() {
        menuUI.setMenuItem1(restaurant.getMenuItemNames().get(0));
        menuUI.setMenuItem2(restaurant.getMenuItemNames().get(1));
        menuUI.setMenuItem3(restaurant.getMenuItemNames().get(2));
        menuUI.setMenuItem4(restaurant.getMenuItemNames().get(3));
        menuUI.setMenuItem5(restaurant.getMenuItemNames().get(4));
        menuUI.setMenuItem6(restaurant.getMenuItemNames().get(5));
        menuUI.setMenuItem7(restaurant.getMenuItemNames().get(6));
        menuUI.setMenuItemPrice1(restaurant.getMenuItemPrices().get(0));
        menuUI.setMenuItemPrice2(restaurant.getMenuItemPrices().get(1));
        menuUI.setMenuItemPrice3(restaurant.getMenuItemPrices().get(2));
        menuUI.setMenuItemPrice4(restaurant.getMenuItemPrices().get(3));
        menuUI.setMenuItemPrice5(restaurant.getMenuItemPrices().get(4));
        menuUI.setMenuItemPrice6(restaurant.getMenuItemPrices().get(5));
        menuUI.setMenuItemPrice7(restaurant.getMenuItemPrices().get(6));
        menuUI.setMenuTitle(restaurant.getRestaurantName());
    }

    /**
     * gets the order total based on menu item prices and amounts selected of
     * each item
     *
     * @return String total
     */
    public String getMenuItemAmts() {
        double total = Double.parseDouble(menuUI.getMenuItemPrice1().getText()) * (Integer) menuUI.getMenuItemAmt1().getValue()
                + Double.parseDouble(menuUI.getMenuItemPrice2().getText()) * (Integer) menuUI.getMenuItemAmt2().getValue()
                + Double.parseDouble(menuUI.getMenuItemPrice3().getText()) * (Integer) menuUI.getMenuItemAmt3().getValue()
                + Double.parseDouble(menuUI.getMenuItemPrice4().getText()) * (Integer) menuUI.getMenuItemAmt4().getValue()
                + Double.parseDouble(menuUI.getMenuItemPrice5().getText()) * (Integer) menuUI.getMenuItemAmt5().getValue()
                + Double.parseDouble(menuUI.getMenuItemPrice6().getText()) * (Integer) menuUI.getMenuItemAmt6().getValue()
                + Double.parseDouble(menuUI.getMenuItemPrice7().getText()) * (Integer) menuUI.getMenuItemAmt7().getValue();
        return String.format("%.2f", total);
    }

    /**
     * Method to 'connect' to our user
     *
     * @param menuInterface a user interface which can view the menu
     * @return the connection status
     */
    public boolean connectedUserClient(RestaurantMenuUI menuInterface) {
        menuUI = menuInterface;
        return true;
    }

    /**
     * Action Events for buttons
     *
     * @param e representing an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == menuUI.reviewOrderBtn) {
            orderCntrl = new RestaurantOrderController(this);
            menuUI.setVisible(false);
        }
        if (obj == menuUI.backBtn) {
            navCntrl = new NavigationController();
            menuUI.setVisible(false);
        }
    }

}
