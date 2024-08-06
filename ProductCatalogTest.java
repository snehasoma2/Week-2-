import java.util.HashSet;

 class ProductCatalog {
    private HashSet<String> products;

    public ProductCatalog() {
        products = new HashSet<>();
    }

    public boolean addProduct(String productName) {
        return products.add(productName);
    }

    public boolean removeProduct(String productName) {
        return products.remove(productName);
    }

    public boolean searchProduct(String productName) {
        return products.contains(productName);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("The product catalog is empty.");
        } else {
            System.out.println("Product Catalog:");
            for (String product : products) {
                System.out.println("- " + product);
            }
        }
    }
}

public class ProductCatalogTest {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        // Add products
        catalog.addProduct("Laptop");
        catalog.addProduct("Smartphone");
        catalog.addProduct("Headphones");

        // Display products
        catalog.displayProducts();

        // Search for a product
        System.out.println("Is 'Laptop' in the catalog? " + catalog.searchProduct("Laptop"));
        System.out.println("Is 'Tablet' in the catalog? " + catalog.searchProduct("Tablet"));

        // Remove a product
        catalog.removeProduct("Smartphone");

        // Display products again
        catalog.displayProducts();
    }
}

