package View;

import Controller.RestaurantController;
import Model.Restaurants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author bpardee
 */
public class RestaurantMenuUI extends javax.swing.JFrame {

    private RestaurantController restCntrl;
    private Restaurants restaurant;
    private RestaurantMenuUI menuUI;

    /**
     * Creates new form RestaurantMenuUI
     *
     * @param restCntrl references the Restaurant Controller class
     * @param restaurant references the Restaurants class
     */
    public RestaurantMenuUI(RestaurantController restCntrl, Restaurants restaurant) {
        this.restCntrl = restCntrl;
        this.restaurant = restaurant;
        initComponents();
        progressBar = new javax.swing.JProgressBar(0, 100);
        jPanel2.add(progressBar);
        progressBar.setSize(350, 40);
        progressBar.setValue(2);
        progressBar.setVisible(true);
    }

    /**
     * Method to connect to our RestaurantController
     *
     * @param restController a menu
     * @return the connection status
     */
    public boolean connectedRestServer(RestaurantController restController) {
        restCntrl = restController;
        return true;
    }

    /**
     * getter for menu item 1 label
     *
     * @return JLabel menuItem1
     */
    public JLabel getMenuItem1() {
        return menuItem1;
    }

    /**
     * setter for menu item 1
     *
     * @param menuItem1 JLabel for menu item 1
     */
    public void setMenuItem1(String menuItem1) {
        this.menuItem1.setText(menuItem1);
    }

    /**
     * getter for menu item 2 label
     *
     * @return JLabel menuItem2
     */
    public JLabel getMenuItem2() {
        return menuItem2;
    }

    /**
     * setter for menu item 2
     *
     * @param menuItem1 JLabel for menu item 2
     */
    public void setMenuItem2(String menuItem2) {
        this.menuItem2.setText(menuItem2);
    }

    /**
     * getter for menu item 3 label
     *
     * @return JLabel menuItem3
     */
    public JLabel getMenuItem3() {
        return menuItem3;
    }

    /**
     * setter for menu item 3
     *
     * @param menuItem1 JLabel for menu item 3
     */
    public void setMenuItem3(String menuItem3) {
        this.menuItem3.setText(menuItem3);
    }

    /**
     * getter for menu item 4 label
     *
     * @return JLabel menuItem4
     */
    public JLabel getMenuItem4() {
        return menuItem4;
    }

    /**
     * setter for menu item 4
     *
     * @param menuItem1 JLabel for menu item 4
     */
    public void setMenuItem4(String menuItem4) {
        this.menuItem4.setText(menuItem4);
    }

    /**
     * getter for menu item 5 label
     *
     * @return JLabel menuItem5
     */
    public JLabel getMenuItem5() {
        return menuItem5;
    }

    /**
     * setter for menu item 5
     *
     * @param menuItem1 JLabel for menu item 5
     */
    public void setMenuItem5(String menuItem5) {
        this.menuItem5.setText(menuItem5);
    }

    /**
     * getter for menu item 6 label
     *
     * @return JLabel menuItem6
     */
    public JLabel getMenuItem6() {
        return menuItem6;
    }

    /**
     * setter for menu item 6
     *
     * @param menuItem1 JLabel for menu item 6
     */
    public void setMenuItem6(String menuItem6) {
        this.menuItem6.setText(menuItem6);
    }

    /**
     * getter for menu item 7 label
     *
     * @return JLabel menuItem7
     */
    public JLabel getMenuItem7() {
        return menuItem7;
    }

    /**
     * setter for menu item 7
     *
     * @param menuItem1 JLabel for menu item 7
     */
    public void setMenuItem7(String menuItem7) {
        this.menuItem7.setText(menuItem7);
    }

    public JSpinner getMenuItemAmt1() {
        return menuItemAmt1;
    }

    public void setMenuItemAmt1(JSpinner menuItemAmt1) {
        this.menuItemAmt1 = menuItemAmt1;
    }

    public JSpinner getMenuItemAmt2() {
        return menuItemAmt2;
    }

    public void setMenuItemAmt2(JSpinner menuItemAmt2) {
        this.menuItemAmt2 = menuItemAmt2;
    }

    public JSpinner getMenuItemAmt3() {
        return menuItemAmt3;
    }

    public void setMenuItemAmt3(JSpinner menuItemAmt3) {
        this.menuItemAmt3 = menuItemAmt3;
    }

    public JSpinner getMenuItemAmt4() {
        return menuItemAmt4;
    }

    public void setMenuItemAmt4(JSpinner menuItemAmt4) {
        this.menuItemAmt4 = menuItemAmt4;
    }

    public JSpinner getMenuItemAmt5() {
        return menuItemAmt5;
    }

    public void setMenuItemAmt5(JSpinner menuItemAmt5) {
        this.menuItemAmt5 = menuItemAmt5;
    }

    public JSpinner getMenuItemAmt6() {
        return menuItemAmt6;
    }

    public void setMenuItemAmt6(JSpinner menuItemAmt6) {
        this.menuItemAmt6 = menuItemAmt6;
    }

    public JSpinner getMenuItemAmt7() {
        return menuItemAmt7;
    }

    public void setMenuItemAmt7(JSpinner menuItemAmt7) {
        this.menuItemAmt7 = menuItemAmt7;
    }

    /**
     * getter for menu item 1 price
     *
     * @return JLabel menuItemPrice1
     */
    public JLabel getMenuItemPrice1() {
        return menuItemPrice1;
    }

    /**
     * setter for menu item 1 price
     *
     * @param menuItemPrice1 JLabel for menuItemPrice1
     */
    public void setMenuItemPrice1(Double menuItemPrice1) {
        this.menuItemPrice1.setText(String.format("%.2f", menuItemPrice1));
    }

    /**
     * getter for menu item 2 price
     *
     * @return JLabel menuItemPrice2
     */
    public JLabel getMenuItemPrice2() {
        return menuItemPrice2;
    }

    /**
     * setter for menu item 2 price
     *
     * @param menuItemPrice2 JLabel for menuItemPrice2
     */
    public void setMenuItemPrice2(Double menuItemPrice2) {
        this.menuItemPrice2.setText(String.format("%.2f", menuItemPrice2));
    }

    /**
     * getter for menu item 3 price
     *
     * @return JLabel menuItemPrice3
     */
    public JLabel getMenuItemPrice3() {
        return menuItemPrice3;
    }

    /**
     * setter for menu item 3 price
     *
     * @param menuItemPrice3 JLabel for menuItemPrice3
     */
    public void setMenuItemPrice3(Double menuItemPrice3) {
        this.menuItemPrice3.setText(String.format("%.2f", menuItemPrice3));
    }

    /**
     * getter for menu item 4 price
     *
     * @return JLabel menuItemPrice4
     */
    public JLabel getMenuItemPrice4() {
        return menuItemPrice4;
    }

    /**
     * setter for menu item 4 price
     *
     * @param menuItemPrice4 JLabel for menuItemPrice4
     */
    public void setMenuItemPrice4(Double menuItemPrice4) {
        this.menuItemPrice4.setText(String.format("%.2f", menuItemPrice4));
    }

    /**
     * getter for menu item 5 price
     *
     * @return JLabel menuItemPrice5
     */
    public JLabel getMenuItemPrice5() {
        return menuItemPrice5;
    }

    /**
     * setter for menu item 5 price
     *
     * @param menuItemPrice5 JLabel for menuItemPrice5
     */
    public void setMenuItemPrice5(Double menuItemPrice5) {
        this.menuItemPrice5.setText(String.format("%.2f", menuItemPrice5));
    }

    /**
     * getter for menu item 6 price
     *
     * @return JLabel menuItemPrice6
     */
    public JLabel getMenuItemPrice6() {
        return menuItemPrice6;
    }

    /**
     * setter for menu item 6 price
     *
     * @param menuItemPrice6 JLabel for menuItemPrice6
     */
    public void setMenuItemPrice6(Double menuItemPrice6) {
        this.menuItemPrice6.setText(String.format("%.2f", menuItemPrice6));
    }

    /**
     * getter for menu item 7 price
     *
     * @return JLabel menuItemPrice7
     */
    public JLabel getMenuItemPrice7() {
        return menuItemPrice7;
    }

    /**
     * setter for menu item 7 price
     *
     * @param menuItemPrice7 JLabel for menuItemPrice7
     */
    public void setMenuItemPrice7(Double menuItemPrice7) {
        this.menuItemPrice7.setText(String.format("%.2f", menuItemPrice7));
    }

    /**
     * getter for menu title
     *
     * @return JLabel menuTitle
     */
    public JLabel getMenuTitle() {
        return menuTitle;
    }

    /**
     * setter for menu title
     *
     * @param title String for menu title
     */
    public void setMenuTitle(String title) {
        this.menuTitle.setText(title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        menuTitle = new javax.swing.JLabel();
        menuItem1 = new javax.swing.JLabel();
        menuItem2 = new javax.swing.JLabel();
        menuItem3 = new javax.swing.JLabel();
        menuItem4 = new javax.swing.JLabel();
        menuItem5 = new javax.swing.JLabel();
        menuItem6 = new javax.swing.JLabel();
        menuItem7 = new javax.swing.JLabel();
        menuItemAmt1 = new javax.swing.JSpinner();
        menuItemAmt2 = new javax.swing.JSpinner();
        menuItemAmt3 = new javax.swing.JSpinner();
        menuItemAmt4 = new javax.swing.JSpinner();
        menuItemAmt5 = new javax.swing.JSpinner();
        menuItemAmt6 = new javax.swing.JSpinner();
        menuItemAmt7 = new javax.swing.JSpinner();
        reviewOrderBtn = new javax.swing.JButton();
        menuItemPrice1 = new javax.swing.JLabel();
        menuItemPrice2 = new javax.swing.JLabel();
        menuItemPrice3 = new javax.swing.JLabel();
        menuItemPrice4 = new javax.swing.JLabel();
        menuItemPrice5 = new javax.swing.JLabel();
        menuItemPrice6 = new javax.swing.JLabel();
        menuItemPrice7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 190, 122));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

        menuTitle.setBackground(new java.awt.Color(255, 255, 255));
        menuTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        menuTitle.setForeground(new java.awt.Color(204, 255, 255));
        menuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTitle.setText("Menu");

        menuItem2.setText("null");

        menuItem3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        menuItem3.setText("Chicken Fingers");

        menuItem4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        menuItem4.setText("Mac and Cheese");

        menuItem5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        menuItem5.setText("Fries");

        menuItem6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        menuItem6.setText("Salad");

        menuItem7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        menuItem7.setText("Soup");

        menuItemAmt1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        menuItemAmt1.setToolTipText("");

        menuItemAmt2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        menuItemAmt3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        menuItemAmt4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        menuItemAmt5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        menuItemAmt6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        menuItemAmt7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        reviewOrderBtn.setText("Review Order");

        menuItemPrice1.setText("4.99");

        menuItemPrice2.setText("5.99");

        menuItemPrice3.setText("4.50");

        menuItemPrice4.setText("4.00");

        menuItemPrice5.setText("3.00");

        menuItemPrice6.setText("6.99");

        menuItemPrice7.setText("4.99");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        backBtn.setText("Back");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/burger40%(1).png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(358, 250));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/burger40%(1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItem1)
                            .addComponent(menuItem2)
                            .addComponent(menuItem3)
                            .addComponent(menuItem4)
                            .addComponent(menuItem5)
                            .addComponent(menuItem6)
                            .addComponent(menuItem7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menuItemPrice7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menuItemAmt7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(menuItemPrice6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menuItemAmt6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menuItemPrice1)
                                    .addComponent(menuItemPrice2)
                                    .addComponent(menuItemPrice3)
                                    .addComponent(menuItemPrice4)
                                    .addComponent(menuItemPrice5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(menuItemAmt1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(menuItemAmt2)
                                    .addComponent(menuItemAmt3)
                                    .addComponent(menuItemAmt4)
                                    .addComponent(menuItemAmt5))))
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(reviewOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuItemAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(menuItem1)
                        .addComponent(menuItemPrice1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem2)
                    .addComponent(menuItemAmt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem3)
                    .addComponent(menuItemAmt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem4)
                    .addComponent(menuItemAmt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem5)
                    .addComponent(menuItemAmt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem6)
                    .addComponent(menuItemAmt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem7)
                    .addComponent(menuItemAmt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice7))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reviewOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.JProgressBar progressBar;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel menuItem1;
    private javax.swing.JLabel menuItem2;
    private javax.swing.JLabel menuItem3;
    private javax.swing.JLabel menuItem4;
    private javax.swing.JLabel menuItem5;
    private javax.swing.JLabel menuItem6;
    private javax.swing.JLabel menuItem7;
    private javax.swing.JSpinner menuItemAmt1;
    private javax.swing.JSpinner menuItemAmt2;
    private javax.swing.JSpinner menuItemAmt3;
    private javax.swing.JSpinner menuItemAmt4;
    private javax.swing.JSpinner menuItemAmt5;
    private javax.swing.JSpinner menuItemAmt6;
    private javax.swing.JSpinner menuItemAmt7;
    private javax.swing.JLabel menuItemPrice1;
    private javax.swing.JLabel menuItemPrice2;
    private javax.swing.JLabel menuItemPrice3;
    private javax.swing.JLabel menuItemPrice4;
    private javax.swing.JLabel menuItemPrice5;
    private javax.swing.JLabel menuItemPrice6;
    private javax.swing.JLabel menuItemPrice7;
    private javax.swing.JLabel menuTitle;
    public javax.swing.JButton reviewOrderBtn;
    // End of variables declaration//GEN-END:variables
    }
