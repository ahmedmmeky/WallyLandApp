package Model;

import java.util.ArrayList;

/**
 *
 * @author bpardee
 */
public class Restaurants {

    private String restaurantName;
    private ArrayList<String> menuItemNames = new ArrayList<>();
    private ArrayList<Double> menuItemPrices = new ArrayList<>();
    private double orderTotal;

    /**
     * Constructor for Restaurants
     *
     * @param restaurantName a String with the restaurant's name
     * @param menuItemNames an ArrayList of Strings of menu item names
     * @param menuItemPrices an ArrayList of Doubles of menu item prices
     * @param orderTotal a double representing the total order price amount
     */
    public Restaurants(String restaurantName, ArrayList<String> menuItemNames, ArrayList<Double> menuItemPrices, double orderTotal) {
        this.restaurantName = restaurantName;
        this.menuItemNames = menuItemNames;
        this.menuItemPrices = menuItemPrices;
        this.orderTotal = orderTotal;
    }

    /**
     * Default Constructor
     */
    public Restaurants() {
        this.restaurantName = "";
        this.menuItemNames = new ArrayList<>();
        this.menuItemPrices = new ArrayList<>();
        this.orderTotal = 0;
    }

    /**
     * getter for restaurant name
     *
     * @return restaurantName (a string of the restaurant's name)
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * setter for restaurant name
     *
     * @param restaurantName sets the String variable for restaurant name
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     * getter for menu item names
     *
     * @return menuItemNames (an ArrayList of menu item names)
     */
    public ArrayList<String> getMenuItemNames() {
        return menuItemNames;
    }

    /**
     * setter for menu item names
     *
     * @param menuItemNames sets the ArrayList values with menu item names
     */
    public void setMenuItemNames(ArrayList<String> menuItemNames) {
        this.menuItemNames = menuItemNames;
    }

    /**
     * getter for menu item prices
     *
     * @return menuItemPrices (an ArrayList of menu item prices)
     */
    public ArrayList<Double> getMenuItemPrices() {
        return menuItemPrices;
    }

    /**
     * setter for menu item prices
     *
     * @param menuItemPrices sets the ArrayList values with menu item prices
     */
    public void setMenuItemPrices(ArrayList<Double> menuItemPrices) {
        this.menuItemPrices = menuItemPrices;
    }

    /**
     * getter for order total
     *
     * @return orderTotal (a double of total order price)
     */
    public double getOrderTotal() {
        return orderTotal;
    }

    /**
     * setter for order total
     *
     * @param orderTotal sets the double value with a total order amount
     */
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public String toString() {
        return "Restaurants{" + "restaurantName=" + restaurantName + ", menuItemNames=" + menuItemNames + ", menuItemPrices=" + menuItemPrices + ", orderTotal=" + orderTotal + '}';
    }

}
