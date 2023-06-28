package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.BEEF;

public class Beef extends Food{
    KitchenMenu food = BEEF;

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }

}
