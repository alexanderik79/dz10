package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.BEEF;
import static restaurant.KitchenMenu.CREAMSOUP;

public class CreamSoup {
    KitchenMenu food = CREAMSOUP;
    public void info(){System.out.println(food.getName()+" (" + food.getPrice()+")");};

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }
}
