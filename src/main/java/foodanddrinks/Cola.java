package foodanddrinks;
import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.COLA;

public class Cola {
    KitchenMenu food = COLA;

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }

}
