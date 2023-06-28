import personals.Barmen;
import personals.Chef;
import personals.Waiter;
import restaurant.Hall;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Hall.openHall();
        Chef chef1 = new Chef("Gannibal", "Chef");
        Waiter waiter1 = new Waiter("Jack");
        Barmen barmen1 = new Barmen("Zodiac", "Barmen");
        chef1.greeting();
        barmen1.greeting();
        waiter1.greeting();

        waiter1.reserveTable();
        waiter1.preparing();
        waiter1.starting();
        waiter1.starting2();
        chef1.preparing();
        barmen1.preparing();
    }
}