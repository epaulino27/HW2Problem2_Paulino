import java.util.ArrayList;

public class Customer {
    //defined variables
    String name;
    static ArrayList<Customer> customers = new ArrayList<Customer>();

    //constructor
    Customer(String name){
        this.name = name;
        addCustomer();
    }

    //add or remove customers
    public void addCustomer(){
        customers.add(this);
    }
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    public void recieveNotification(ArrayList<Customer> SubscriberList, String deal){
        //customize notification based on subscriber list
        if(SubscriberList.contains(this)){
            System.out.println("Dear " + this.name + ", " + deal);
        } else {
            System.out.println("Customer '" + this.name + "' is not subscribed to this notification list and has not been notified.");
        }
    }
}
