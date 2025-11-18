public class Product extends ProductComponent{
    //constructor
    Product(String name, Double price) {
        super(name);
        this.price = price;
    }

    @Override
    public void display(){
        System.out.println("    Product: " + this.getName() + ", Price: $" + this.getPrice() );
    }

    //getter
    public Double getPrice() {
        //rounds to 2 decimal points
        return Math.round(price * 100.0) / 100.0;
    }
}
