package personals;

import java.io.File;
import java.io.IOException;

public class Barmen extends RestaurantWorker{
    public String placeOfWork = "Bar";
    public Barmen(String name, String position) {
        super(name, position);
    }

    public void preparing() {
        File orders = new File("src/res"+placeOfWork+"/");
        for (File files : orders.listFiles())
        {
            if(files.isFile()){
                System.out.println(files.getName());
                try {
                    starting(files);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
