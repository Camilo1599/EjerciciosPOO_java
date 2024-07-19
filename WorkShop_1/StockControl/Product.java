package StockControl;

public class Product {
    int id;
    String description;
    int stockQuantity;

    public Product(int id, String description, int stockQuantity){
        this.id = id;
        this.description = description;
        this.stockQuantity = stockQuantity;

    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
