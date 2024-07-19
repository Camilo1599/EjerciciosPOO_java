import java.util.ArrayList;


public class Inventory {
    
    private ArrayList<Product> products;

    public Inventory(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public ArrayList<Product> obtainProducts(){
        return products;
    }

    public void searchName(String name){

    }

    public void searchCategory(String category){

    }
}
