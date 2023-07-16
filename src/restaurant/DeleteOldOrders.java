package restaurant;

import java.io.File;

public class DeleteOldOrders {
    public void deleteOldOrdersKitchen (){
        File folder = new File("src/resKitchen/");
        for (File file : folder.listFiles())
        {
            if (file.delete()){
                System.out.println("Cleaning working area");
            }
        }
        File folder2 = new File("src/resPastryKitchen/");
        for (File file : folder2.listFiles())
        {
            if (file.delete()){
                System.out.println("Cleaning working area");
            }
        }
        File folder3 = new File("src/resGravyKitchen/");
        for (File file : folder3.listFiles())
        {
            if (file.delete()){
                System.out.println("Cleaning working area");
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
