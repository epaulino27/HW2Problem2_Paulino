import java.util.ArrayList;

public class Category extends ProductComponent{
    //list holding all categories
    ArrayList categoryList;

    //constructor
    Category(String name) {
        super(name);
        this.categoryList = new ArrayList();
    }

    //add or remove category or product
    public void add(Object item){
        categoryList.add(item);
    }
    public void remove(Object item){
        categoryList.remove(item);
    }

    //print everything, including specification for category or product
    @Override
    public void display(){
        System.out.println("Category: " + this.name);
        for(Object item: categoryList){
            //if it's a category recursively run this method
            if(item instanceof Category){
                ((Category) item).display();
            }
            //if it's a product run product display
            if(item instanceof Product){
                ((Product) item).display();
            }
        }
    }
}
