
public class Product {

    public static void main(String[] args) {

        ProductLogic productLogic = new ProductLogic();

        // LETS ADD SOME NEW PRODUCTS

        productLogic.addNewProduct("Lamp", 2, "Ground");
        productLogic.addNewProduct("Fan", 3, "Floor");
        productLogic.addNewProduct("Lighter", 4, "Air");
        productLogic.addNewProduct("Weight", 5, "Ground");

        System.out.println();
        System.out.println();
        System.out.println();

        // LETS PRINT THEM ALL
        productLogic.printAllProducts();

        System.out.println();
        System.out.println();
        System.out.println();

        // LETS FIND A SINGLE ONE
        productLogic.findProductByName("Lighter");

        System.out.println();
        System.out.println();
        System.out.println();

        // LETS FIND A SINGLE ONE
        productLogic.findProductByID(5);

        System.out.println();
        System.out.println();
        System.out.println();

    }

}
