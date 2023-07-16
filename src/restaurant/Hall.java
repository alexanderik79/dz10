package restaurant;

import java.util.ArrayList;

public class Hall {

    public static String table;
    public static int randomtable = 0;
    public static ArrayList<String> tables =  new ArrayList<>();

    public static void openHall(){
        DeleteOldOrders deleteOldOrders = new DeleteOldOrders();
        deleteOldOrders.deleteOldOrdersBar();
        deleteOldOrders.deleteOldOrdersKitchen();

        System.out.println("\nOpen restaurant !!!\n");

        tables.add("table #1");
        tables.add("table #2");
        tables.add("table #3");
//        tables.add("table #4");
//        tables.add("table #5");
//        tables.add("table #6");
//        tables.add("table #7");
//        tables.add("table #8");
//        tables.add("table #9");
//        tables.add("table #10");
    }

//    public String getTable(){
//        randomtable = (int) (Math.random() * tables.size());
//        String table = tables.get(randomtable);
//        tables.remove(table);
//        System.out.println(tables);
//        return table;
//    }
    public static boolean hasTable(){
        return tables.size() > 0;
    }
}