package restaurant;

import personals.*;

public class Service extends Thread {

    public void run() {
        Chef chef1 = new Chef("Gannibal", "Chef");
        GravyChef gravyChef1 = new GravyChef("Chegevara", "GravyChef");
        PastryChef pastryChef1 = new PastryChef("Givi", "PastryChef");
        Waiter waiter1 = new Waiter("Jack");
        Barmen barmen1 = new Barmen("Zodiac", "Barmen");
        chef1.greeting();
        gravyChef1.greeting();
        pastryChef1.greeting();
        barmen1.greeting();

        while (Hall.tables.size()>7) {                      //до 3-х столов
//        while (Hall.tables.size()>5) {                    //до 5-ти столов
//        while (Hall.hasTable()) {                         //до полного заполнения ресторана
            waiter1.greeting();
            System.out.println("We have those free tables: " + Hall.tables);
            waiter1.reserveTable();
            waiter1.preparing();
            OrderFood order = new OrderFood();
            waiter1.starting("food", order);
            waiter1.starting("drinks", order);
        }
        chef1.preparing(chef1.placeOfWork);
        gravyChef1.preparing(gravyChef1.placeOfWork);
        pastryChef1.preparing(pastryChef1.placeOfWork);
        barmen1.preparing(barmen1.placeOfWork);
        DeleteOldOrders.deleteOldOrdersBar();
        DeleteOldOrders.deleteOldOrdersKitchen();


        while (Hall.hasTableBusy()) {
            for (String table : Hall.tablesBusy
            ) {
                if (waiter1.greetingPostOrder(table)) {
                    OrderFood order = new OrderFood();
                    waiter1.starting("food", order);
                    waiter1.starting("drinks", order);
                }
                chef1.preparing(chef1.placeOfWork);
                gravyChef1.preparing(gravyChef1.placeOfWork);
                pastryChef1.preparing(pastryChef1.placeOfWork);
                barmen1.preparing(barmen1.placeOfWork);
                DeleteOldOrders.deleteOldOrdersBar();
                DeleteOldOrders.deleteOldOrdersKitchen();
            }
            Hall.tablesBusy.clear();
        }
    }
}