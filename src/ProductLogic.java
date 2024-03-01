import java.util.ArrayList;
import java.util.List;

public class ProductLogic {
    List<OfficeItems> singleItem = new ArrayList<>();

    public void printAllProducts() {
        for (OfficeItems officeItems : singleItem) {
            System.out.println(officeItems);
        }
    }

    public void addNewProduct (String name, int id, String position){
        singleItem.add(new OfficeItems(name, id, position));
    }

    public void findProductByName(String name){
        for (OfficeItems s : singleItem) {
            if(s.getName().equals(name)){
                System.out.println(s);
            }
        }
    }


    public void findProductByID(int id){
        for (OfficeItems s : singleItem) {
            if(s.getid() == id){
                System.out.println(s);
            }
        }
    }
}
