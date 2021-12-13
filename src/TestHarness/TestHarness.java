package TestHarness;

/**
 *
 * @author
 */
public class TestHarness {

    public static void main(String[] args) {

        //Restaurant Tests
        System.out.println("Running Test Stubs for Restaurant Ordering...");
        RestaurantTestHarness restTest = new RestaurantTestHarness();
        // RestaurantController Test Stubs
        restTest.RCTestStubs();
        // RestaurantOrderController Test Stubs
        restTest.ROCTestStubs();
        // RestaurantMenuUI Test Stubs
        restTest.RMUITestStubs();
        // RestaurantOrderUI Test Stubs
        restTest.ROUITestStubs();
        // Restaurant Test Stubs
        restTest.RTestStubs();

        //Navigation Tests
        System.out.println("Running Test Stubs for Navigation...");
        // NavigationController Test Stubs
        restTest.NCTestStubs();
        // NavigationUI Test Stubs
        restTest.NUITestStubs();

        //Activity Tests 
        System.out.println("Running Test Stubs for Activity Class");
        ActivityTestHarness activityTest = new ActivityTestHarness();
        //Activity Model Class Test
        activityTest.testModelActivity();

        //Admin Navigation Tests 
        System.out.println("Running Test Stubs for Admin Navigation...");
        //AdminNavigationController Test Stubs 
        activityTest.ACTestStubs();
        //AdminNavaigationUI Test Stubs 
        activityTest.ANUITestStubs();

        // User Tests
        LoginTestHarness loginTest = new LoginTestHarness();
        System.out.println("Running Test Stubs for User Class...");
        loginTest.UserTests();

        // Login Tests
        System.out.println("Running Test Stubs for Login...");
        // LoginController Tests
        loginTest.LCTestStubs();
        // Login
        loginTest.LPTestStubs();

        // Reservation Tests
        System.out.println("Running Test Stubs for Registration...");
        ReservationTestHarness resTest = new ReservationTestHarness();
        resTest.ResTestStubs();

        // Purchasing Tickets Tests
        System.out.println("Running Test Stubs for Purchasing Tickets...");
        PurchasingTestHarness purchaseTest = new PurchasingTestHarness();
        // PurchaseTicketsController tests
        purchaseTest.PTTestStubs();
        // ViewTicketsController tests
        purchaseTest.VTTestStubs();
        // View tickets UI tests
        purchaseTest.PTUITestStubs();
        // purchase tickets UI tests
        purchaseTest.VTITestStubs();
        // model tests
        purchaseTest.VMTestStubs();
        purchaseTest.PMTestStubs();

        System.out.println("End All Tests");
    }

}
