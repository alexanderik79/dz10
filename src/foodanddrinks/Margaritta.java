package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.BEEF;
import static restaurant.KitchenMenu.MARGARITTA;

public class Margaritta extends Food{
    KitchenMenu food = MARGARITTA;

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }

}
