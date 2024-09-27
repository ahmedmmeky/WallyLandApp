package TestHarness;

import Controller.NavigationController;
import Controller.RestaurantController;
import Controller.RestaurantOrderController;
import Model.Restaurants;
import View.NavigationUI;
import View.RestaurantMenuUI;
import View.RestaurantOrderUI;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author bpardee
 */
public class RestaurantTestHarness {

    // Navigation interface and logic
    NavigationController navCntrl = new NavigationController();
    NavigationUI navUI = new NavigationUI(navCntrl);

    // Restaurant Ordering (menu and order) - create interface and logic
    Restaurants restaurant = new Restaurants();
    RestaurantController menuCntrl = new RestaurantController(navCntrl);
    RestaurantOrderController orderCntrl = new RestaurantOrderController(menuCntrl);
    RestaurantMenuUI menuUI = new RestaurantMenuUI(menuCntrl, restaurant);
    RestaurantOrderUI orderUI = new RestaurantOrderUI(orderCntrl, restaurant);

    // Package -> Controller -> RestaurantController test stubs
    public void RCTestStubs() {
        boolean connectStatus = menuCntrl.connectedUserClient(menuUI);
        System.out.println("  RestaurantController.connectUserClient output: " + connectStatus);
    }

    // Package -> Controller -> RestaurantOrderController
    public void ROCTestStubs() {
        boolean connectStatus = orderCntrl.connectedUserClient(orderUI);
        System.out.println("  RestaurantOrderController.connectUserClient output: " + connectStatus);
    }

    // Package -> Controller -> NavigationController
    public void NCTestStubs() {
        boolean connectStatus = navCntrl.connectedUserClient(navUI);
        System.out.println("  NavigationController.connectUserClient output: " + connectStatus);
    }

    // Package -> View -> RestaurantMenuUI
    public void RMUITestStubs() {
        boolean boolStatus = menuUI.connectedRestServer(menuCntrl);
        System.out.println("  RestaurantMenuUI.connectRestServer output: " + boolStatus);
    }

    // Package -> View -> RestaurantOrderUI
    public void ROUITestStubs() {
        boolean boolStatus = orderUI.connectedRestServer(orderCntrl);
        System.out.println("  RestaurantOrderUI.connectRestServer output: " + boolStatus);
    }

    // Package -> View -> NavigationUI
    public void NUITestStubs() {
        boolean boolStatus = navUI.connectedRestServer(navCntrl);
        System.out.println("  NavigationUI.connectRestServer output: " + boolStatus);
    }

    // Package -> Model -> Restaurants
    public void RTestStubs() {
        System.out.println("  Testing Restaurant Class -> setRestaurantName with 'Food Court'");
        restaurant.setRestaurantName("Food Court");
        System.out.println("  Testing Restaurant Class -> getRestaurantName: " + restaurant.getRestaurantName());

        System.out.println("  Testing Restaurant Class -> setMenuItemNames with 'hamburger' and 'mac and cheese'");
        restaurant.setMenuItemNames(new ArrayList<String>(Arrays.asList("hamburger", "mac and cheese")));
        System.out.println("  Testing Restaurant Class -> getMenuItemNames: " + restaurant.getMenuItemNames());

        System.out.println("  Testing Restaurant Class -> setMenuItemPrices with '4.99' and '5.99'");
        restaurant.setMenuItemPrices(new ArrayList<Double>(Arrays.asList(4.99, 5.99)));
        System.out.println("  Testing Restaurant Class -> getMenuItemPrices: " + restaurant.getMenuItemPrices());

        System.out.println("  Testing Restaurant Class -> setOrderTotal with '24.99'");
        restaurant.setOrderTotal(24.99);
        System.out.println("  Testing Restaurant Class -> getOrderTotal: " + restaurant.getOrderTotal());

        System.out.println("  Testing Restaurant Class -> toString: " + restaurant.toString());
    }

}
