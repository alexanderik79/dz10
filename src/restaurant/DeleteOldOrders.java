package restaurant;

import java.io.File;

public class DeleteOldOrders {
    public void deleteOldOrdersKitchen (){

        File folder = new File("src/resKitchen/");
        // сканируем все директории в папке resources и закидываем их пути в list
        for (File file : folder.listFiles())
        {
            if (file.delete()){
                System.out.println("Cleaning tables");
            }
        }
    }
    public void deleteOldOrdersBar (){
        File folder = new File("src/resBar/");
        // сканируем все директории в папке resources и закидываем их пути в list
        for (File file : folder.listFiles())
        {
            if (file.delete()){
                System.out.println("Cleaning Bar");
            }
        }
}
}
