package ticketing.entity;
import ticketing.entity.Ticket;

public class AdvancedBookingTicket extends Ticket{
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance){
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    public double calculatePrice(){
        double temp = super.calculatePrice();
        double compare = super.calculatePrice();
        for (int i = 0; i < numDaysInAdvance; i++){
            temp -= 0.50;
            if (temp < compare/2){
                temp = compare/2;
            }
        }
        return temp;
    }
}