import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //make products
        Product product1 = new Product("Phone", 90.00);
        Product product2 = new Product("Computer", 150.00);
        Product product3 = new Product("Yo-Yo", 5.00);
        Product product4 = new Product("Milk", 7.00);
        Product product5 = new Product("Cheese", 3.00);
        Product product6 = new Product("Apples", 8.99);

        //make categories
        Category Tech = new Category("Tech");
        Tech.add(product1);
        Tech.add(product2);
        Category Toys = new Category("Kids Toys");
        Toys.add(product3);
        Category Dairy = new Category("Diary");
        Dairy.add(product4);
        Dairy.add(product5);
        Category Fruit = new Category("Fruit");
        Fruit.add(product6);
        Category Food = new Category("Food");
        Food.add(Dairy);
        Food.add(Fruit);

        //display products + categories
        System.out.println("Product Catalogue: \n");
        Tech.display();
        Toys.display();
        Food.display();

        //make customers
        Customer Bruce = new Customer("Bruce");
        Customer Mr = new Customer("Mr. Oswald");
        Customer Jack = new Customer("Jack");

        //subscriber list for black friday deals
        ArrayList<Customer> subscribers = new ArrayList<Customer>();
        //Black Friday Deals
        BlackFridayDeals BlackFridayDeals = new BlackFridayDeals();

        //assign customers to black friday deal subscriber list
        subscribers.add(Bruce);
        subscribers.add(Mr);

        //display
        System.out.println();
        BlackFridayDeals.notifyCustomers(subscribers, "there is an exclusive Black Friday Deal on Tech!");

    }
}
