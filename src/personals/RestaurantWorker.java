package personals;

import foodanddrinks.*;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class RestaurantWorker{
    String name;
    String position;

    public RestaurantWorker(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void greeting() {
        System.out.println(name +": "+ "Welcome. I am a "+position+" My name is " + name + " i will service you");
    }

    public void starting(File file) throws IOException {
        String table = "";
        HashMap<Integer, Integer> coockingOrder = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        String[] subStr;
        String delimeter = " ";
        System.out.println(name +": "+ "read an order: " + file);
        try {
            while ((line = br.readLine()) != null) {
                subStr = line.split(delimeter);
                coockingOrder.put(Integer.parseInt(subStr[0]), Integer.parseInt(subStr[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Map.Entry pair: coockingOrder.entrySet()
        ) {
            // System.out.println(pair.getKey()+" "+pair.getValue()+"pcs !!!");
            table = file.getName().substring(6);
        }
        coocking(coockingOrder, table, file);
        br.close();
    }
    public void coocking(HashMap<Integer, Integer> order, String table, File file) {
        System.out.println(name + ": " + "Start coocking for " + table);
        Waiter waiter = new Waiter("Garson");
        for (Map.Entry<Integer, Integer> pair : order.entrySet()
        ) {
            int food = pair.getKey();
            int count = pair.getValue();
            for (int i = 0; i < count; i++) {
                switch (food) {
                    case 1:
                        Cake cake = new Cake();
                        cake.IsReady();
                        cake.coooooking();
                        waiter.bringFood(cake.getName(), table);
                        break;
                    case 2:
                        Salad salad = new Salad();
                        salad.IsReady();
                        salad.coooooking();
                        waiter.bringFood(salad.getName(), table);
                        break;
                    case 3:
                        Potato potato = new Potato();
                        potato.IsReady();
                        potato.coooooking();
                        waiter.bringFood(potato.getName(), table);
                        break;
                    case 4:
                        Beef beef = new Beef();
                        beef.IsReady();
                        beef.coooooking();
                        waiter.bringFood(beef.getName(), table);
                        break;
                    case 5:
                        BloodyMary bloodyMary = new BloodyMary();
                        bloodyMary.IsReady();
                        bloodyMary.coooooking();
                        waiter.bringFood(bloodyMary.getName(), table);
                        break;
                    case 6:
                        Margaritta margaritta = new Margaritta();
                        margaritta.IsReady();
                        margaritta.coooooking();
                        waiter.bringFood(margaritta.getName(), table);
                        break;
                    case 7:
                        GordonPink gordonPink = new GordonPink();
                        gordonPink.IsReady();
                        gordonPink.coooooking();
                        waiter.bringFood(gordonPink.getName(), table);
                        break;
                    case 8:
                        Manhattan manhattan = new Manhattan();
                        manhattan.IsReady();
                        manhattan.coooooking();
                        waiter.bringFood(manhattan.getName(), table);
                        break;
                    case 9:
                        Cola cola = new Cola();
                        cola.IsReady();
                        cola.coooooking();
                        waiter.bringFood(cola.getName(), table);
                        break;
                }
            }
        }
//        System.out.println(file + "!!!!!!!!!!!!!!!!!!!!!!!!");
//        if (file.delete()) {
//            System.out.println(123);
//
//        }
    }
}
