package personals;

import java.io.*;

public class Chef extends RestaurantWorker {
    public String placeOfWork = "Kitchen";

    public Chef(String name, String position) {
        super(name, position);
    }

    public void preparing() {
        File orders = new File("src/res" + placeOfWork + "/");
        for (File files : orders.listFiles()) {
            if (files.isFile()) {
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