package restaurant;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderFood {
    public String table = Hall.table;
    public Map<Integer, Integer> orderFoodToKitchen = new HashMap<>();
    private Map<String, Integer> orderFoodToClient = new HashMap<>();

    public void makeOrder(int number, int quantity, String placeOfWork){
        orderFoodToKitchen.put(number, quantity);
        File file = new File("src/res"+placeOfWork+"/order "+table);
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file, true);
            writer.write(number+" "+quantity+"\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void makeOrderToClient(String food, int quantity){orderFoodToClient.put(food, quantity);}
    public void printOrder() {
        System.out.println("Your "+table+" and order is:");
        for (Map.Entry pair: orderFoodToClient.entrySet()
        ) {
            System.out.println(pair.getKey()+" "+pair.getValue()+"pcs");
        }
        System.out.println("_____________________________");
    }
}
