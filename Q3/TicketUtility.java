import java.util.*;
public class TicketUtility{
    public static double calculateAverageTicketPrice(ArrayList<Ticket> ticketList){
        double total = 0;
        if (ticketList == null || ticketList.size() == 0){
            return 0.0;
        }

        for (int i = 0; i < ticketList.size(); i++){
            total += ticketList.get(i).calculatePrice();
        }

        return total/ticketList.size();
    }
}