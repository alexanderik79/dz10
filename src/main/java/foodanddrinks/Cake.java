package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.CAKE;

public class Cake {
    KitchenMenu food = CAKE;

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");

    }
    public String getName(){
        return food.getName();
    }
}
