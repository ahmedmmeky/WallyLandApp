package Controller;

import View.TicketOrderUI;
import Model.Ticket;
import Model.SeasonTicket;
import Model.DayTicket;
import Model.WeekTicket;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * this will control the order gui
 *
 * @author hayde
 */
public class TicketsOrderController implements ActionListener {

    private TicketOrderUI ticketOrderUI;
    private TicketsOrderController orderTix;
    private ViewTicketsController viewScreen;
    private CreditCardInputViewController purchaseScreen;
    private NavigationController navCntrl;
    private SeasonTicket seasonTix;
    private DayTicket dayTix;
    private WeekTicket weekTix;

    /**
     * Constructor
     *
     * @param navCntrl
     */
    public TicketsOrderController(NavigationController navCntrl) {
        this.navCntrl = navCntrl;
        seasonTix = new SeasonTicket();
        dayTix = new DayTicket();
        weekTix = new WeekTicket();

        ticketOrderUI = new TicketOrderUI(orderTix, seasonTix, weekTix, dayTix);
        ticketOrderUI.purchaseTixBtn.addActionListener(this);
        ticketOrderUI.menuBtn.addActionListener(this);
        ticketOrderUI.setVisible(true);

        //System.out.println("Working");
        System.out.println(seasonTix.getPrice());
        setTicketOrderValues();
    }

    public void setTicketOrderValues() {
        // System.out.println("Working in method");
        ticketOrderUI.setDayTicketItem(dayTix.getType());
        ticketOrderUI.setWeekTicketItem(weekTix.getType());
        ticketOrderUI.setSeasonTicketItem(seasonTix.getType());
        ticketOrderUI.setDayTicketPrice(dayTix.getPrice());
        ticketOrderUI.setWeekTicketPrice(weekTix.getPrice());
        ticketOrderUI.setSeasonTicketPrice(seasonTix.getPrice());
    }

    public Double getTicketOrders() {
        double total = Double.parseDouble(ticketOrderUI.getDayTicketPrice().getText()) * (Integer) ticketOrderUI.getDayTixAmt().getValue()
                + Double.parseDouble(ticketOrderUI.getWeekTicketPrice().getText()) * (Integer) ticketOrderUI.getWeekTixAmt().getValue()
                + Double.parseDouble(ticketOrderUI.getSeasonTicketPrice().getText()) * (Integer) ticketOrderUI.getSeasonTixAmt().getValue();
        return total;
    }

    public ArrayList<Ticket> generateTickets(Integer dayTixAmt, Integer weekTixAmt, Integer seasonTixAmt) {

        ArrayList<Ticket> orderedTickets = new ArrayList();

        for (int i = 0; i < dayTixAmt; i++) {
            dayTix = new DayTicket();
            orderedTickets.add(dayTix);
        }

        for (int i = 0; i < weekTixAmt; i++) {
            weekTix = new WeekTicket();
            orderedTickets.add(weekTix);
        }

        for (int i = 0; i < seasonTixAmt; i++) {
            seasonTix = new SeasonTicket();
            orderedTickets.add(seasonTix);
        }

        return orderedTickets;
    }

    /**
     * Action Events for buttons
     *
     * @param e the command line arguments
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == ticketOrderUI.purchaseTixBtn) {
            int dayAmt = (Integer) ticketOrderUI.getDayTixAmt().getValue();
            int weekAmt = (Integer) ticketOrderUI.getWeekTixAmt().getValue();
            int seasonAmt = (Integer) ticketOrderUI.getSeasonTixAmt().getValue();

            ArrayList<Ticket> orderedTicket = generateTickets(dayAmt, weekAmt, seasonAmt);

            purchaseScreen = new CreditCardInputViewController(navCntrl, this, orderedTicket);
            ticketOrderUI.setVisible(false);
        }
        if (obj == ticketOrderUI.menuBtn) {
            navCntrl = new NavigationController();
            ticketOrderUI.setVisible(false);

        }
    }

    public boolean connectedUserClient(TicketOrderUI ticketOrderUI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
