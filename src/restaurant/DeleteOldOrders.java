package restaurant;

import java.io.File;

public class DeleteOldOrders {
    public void deleteOldOrdersKitchen (){
        File folder = new File("src/resKitchen/");
        for (File file : folder.listFiles())
        {
            if (file.delete()){
                System.out.println("Cleaning tables");
            }
        }
    }
    public void deleteOldOrdersBar (){
        File folder = new File("src/resBar/");
        for (File file : folder.listFiles())
        {
            if (file.delete()){
                System.out.println("Cleaning Bar");
            }
        }
    }
}
