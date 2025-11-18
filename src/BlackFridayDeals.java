import java.util.ArrayList;

public class BlackFridayDeals {
    //notify all subscribed customers
    public void notifyCustomers(ArrayList<Customer> SubscriberList, String deal){
        //for each customer in general customer list notify
        for(Customer customer: Customer.customers){
            customer.recieveNotification(SubscriberList, deal);
        }
    }

}
