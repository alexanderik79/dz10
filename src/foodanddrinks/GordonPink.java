package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.BEEF;
import static restaurant.KitchenMenu.GORDONPINK;

public class GordonPink extends Food{
    KitchenMenu food = GORDONPINK;

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }

}
