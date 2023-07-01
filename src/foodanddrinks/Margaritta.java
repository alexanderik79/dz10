package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.MARGARITTA;

public class Margaritta {
    KitchenMenu food = MARGARITTA;

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }

}
