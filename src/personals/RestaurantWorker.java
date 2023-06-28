package personals;

import foodanddrinks.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RestaurantWorker{
    String name;
    String position;
    String placeOfWork;
    public RestaurantWorker(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void greeting() {
        System.out.println(name +": "+ "Welcome. I am a "+position+" My name is " + name + " i will service you");
    }

    public void starting(File file) {
        String table = "";
        HashMap<Integer, Integer> coockingOrder = new HashMap<>();

        String line;
        String[] subStr;
        String delimeter = " ";
        System.out.println(name +": "+ "read an order: " + file);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                subStr = line.split(delimeter);
                coockingOrder.put(Integer.parseInt(subStr[0]), Integer.parseInt(subStr[1]));
                // br.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Map.Entry pair: coockingOrder.entrySet()
        ) {
            // System.out.println(pair.getKey()+" "+pair.getValue()+"pcs !!!");
            table = file.getName().substring(6);
        }
        coocking(coockingOrder, table);
    }
    public void coocking(HashMap<Integer, Integer> order, String table) {
        System.out.println(name +": "+ "Start coocking for "+table);
        Waiter waiter = new Waiter("Garson");
        for (Map.Entry<Integer, Integer> pair: order.entrySet()
        ) {
            int food = pair.getKey();
            int count = pair.getValue();
            for (int i = 0; i < count; i++) {
                switch (food){
                    case 1: Cake cake = new Cake();
                        cake.IsReady();
                        cake.coooooking();
                        waiter.bringFood(cake.getName(), table);
                        break;
                    case 2: Salad salad = new Salad();
                        salad.IsReady();
                        salad.coooooking();
                        waiter.bringFood(salad.getName(), table);
                        break;
                    case 3: Potato potato = new Potato();
                        potato.IsReady();
                        potato.coooooking();
                        waiter.bringFood(potato.getName(), table);
                        break;
                    case 4: Beef beef = new Beef();
                        beef.IsReady();
                        beef.coooooking();
                        waiter.bringFood(beef.getName(), table);
                        break;
                    case 5: BloodyMary bloodyMary = new BloodyMary();
                        bloodyMary.IsReady();
                        bloodyMary.coooooking();
                        waiter.bringFood(bloodyMary.getName(), table);
                        break;
                    case 6: Margaritta margaritta = new Margaritta();
                        margaritta.IsReady();
                        margaritta.coooooking();
                        waiter.bringFood(margaritta.getName(), table);
                        break;
                    case 7: GordonPink gordonPink = new GordonPink();
                        gordonPink.IsReady();
                        gordonPink.coooooking();
                        waiter.bringFood(gordonPink.getName(), table);
                        break;
                    case 8: Manhattan manhattan = new Manhattan();
                        manhattan.IsReady();
                        manhattan.coooooking();
                        waiter.bringFood(manhattan.getName(), table);
                        break;
                }
            }
        }
    }
}
