package restaurant;

import java.util.*;

public class Hall {

    public static volatile String table;
    public static int randomtable = 0;
    public static volatile ArrayList<String> tables =  new ArrayList<>();
    public static Set<String> tablesBusy =  new HashSet<>();

    public static void openHall(int countTables){
        DirMaker.makedir();
        DeleteOldOrders.deleteOldOrdersBar();
        DeleteOldOrders.deleteOldOrdersKitchen();

        System.out.println("\nOpen restaurant !!!\n");
        for (int i = 1; i <= countTables; i++) {
            tables.add("table #"+i);
        }
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
    public static boolean hasTableBusy(){
        return tablesBusy.size() > 0;
    }
}