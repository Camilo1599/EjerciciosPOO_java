import java.util.ArrayList;


public class Inventory {
    
    private final ArrayList<SpecificProduct> products;

    public Inventory(){
        products = new ArrayList<>();
    }

    public void addProduct(SpecificProduct product){
        products.add(product);
    }

    public void removeProduct(SpecificProduct product){
        products.remove(product);
    }

    public ArrayList<SpecificProduct> obtainProducts(){
        return products;
    }

    public SpecificProduct searchName(String name){
        for(SpecificProduct product : products){
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }

        }
        return null;

    }

    public SpecificProduct searchCategory(String category){
        for(SpecificProduct product : products){
            if (product.getCategory().equalsIgnoreCase(category)) {
                return product;
            }

        }
        return null;
    }
}
