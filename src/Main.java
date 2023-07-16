import personals.*;
import restaurant.DirMaker;
import restaurant.Hall;
import restaurant.OrderFood;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args)  {
        Hall.openHall();

        DirMaker dirMaker = new DirMaker();
        dirMaker.makedir();

        Chef chef1 = new Chef("Gannibal", "Chef");
        GravyChef gravyChef1 = new GravyChef("Chegevara", "GravyChef");
        PastryChef pastryChef1 = new PastryChef("Givi", "PastryChef");
        Waiter waiter1 = new Waiter("Jack");
        Barmen barmen1 = new Barmen("Zodiac", "Barmen");
        chef1.greeting();
        gravyChef1.greeting();
        pastryChef1.greeting();
        barmen1.greeting();
        waiter1.greeting();

        waiter1.reserveTable();
        waiter1.preparing();
        OrderFood order = new OrderFood();
        waiter1.starting("food", order);
        waiter1.starting("drinks", order);
        chef1.preparing();

        barmen1.preparing();
    }
}