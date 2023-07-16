package personals;

import java.io.File;
import java.io.IOException;

public class Barmen extends RestaurantWorker{
    public String placeOfWork = "resBar";
    public Barmen(String name, String position) {
        super(name, position);
    }

    public void preparing() {
        File orders = new File("src/"+placeOfWork+"/");
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
