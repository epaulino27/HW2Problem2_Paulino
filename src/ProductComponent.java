public abstract class ProductComponent {
    //variables to be inherited
    String name;
    Double price;

    //constructor
    ProductComponent(String name){
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //to be overridden by subclasses
    public void display(){};
}
