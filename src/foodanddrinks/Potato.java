package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.POTATO;

public class Potato {
    KitchenMenu food = POTATO;
    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }
}
