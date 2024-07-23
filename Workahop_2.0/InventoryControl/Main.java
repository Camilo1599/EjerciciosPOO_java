
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        var producto1 = new SpecificProduct(0, "arroz", 1500, "alimentos", "diana");
        var producto2 = new SpecificProduct(1, "cafe", 2500, "Alimentos", "Nescafe");
        var producto3 = new SpecificProduct(2, "axion", 1200, "Aseo", "axion");

        inventory.addProduct(producto1);
        inventory.addProduct(producto2);
        inventory.addProduct(producto3);

        System.out.println(inventory.obtainProducts());

        var listProduct = inventory.obtainProducts();
        for (SpecificProduct product : listProduct) {
            System.out.println("ID: " + product.getId() + ", Nombre: " + product.getName() + ", Precio: $" + product.getPrice() + ", Categoria: " + product.getCategory());
        }
        
        inventory.removeProduct(producto2);

        listProduct = inventory.obtainProducts();
        for (SpecificProduct product : listProduct) {
            System.out.println("ID: " + product.getId() + ", Nombre: " + product.getName() + ", Precio: $" + product.getPrice() + ", Categoria: " + product.getCategory());
        }


        SpecificProduct encontrado = inventory.searchName("axion");
        if(encontrado != null){ 
            System.out.println("\nID: " + encontrado.getId() + ", Nombre: " + encontrado.getName() + ", Precio: $" + encontrado.getPrice() + ", Categoria: " + encontrado.getCategory() + ", Marca: " + encontrado.getBrand());

        }
    }
}
