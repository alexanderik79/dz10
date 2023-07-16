package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.BEEF;
import static restaurant.KitchenMenu.ICECREAM;

public class Icecream {

    KitchenMenu food = ICECREAM;
    public void info(){System.out.println(food.getName()+" (" + food.getPrice()+")");};

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }
}
