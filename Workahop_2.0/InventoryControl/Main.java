import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product producto1 = new Product(0, "arroz", 1500);
        Product producto2 = new Product(1, "cafe", 3000);

        inventory.addProduct(producto1);
        inventory.addProduct(producto2);

        System.out.println(inventory.obtainProducts());

        List<Product> listaProductos = inventory.obtainProducts();
        for (Product product : listaProductos) {
            System.out.println("ID: " + product.getId() + ", Nombre: " + product.getName() + ", Precio: $" + product.getPrice());
        }
        
    }
}
