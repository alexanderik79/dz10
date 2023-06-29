package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.POTATO;

public class Potato extends FoodAndDrinks {
    KitchenMenu food = POTATO;
    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }
}
