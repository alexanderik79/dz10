package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.MANHATTAN;

public class Manhattan extends FoodAndDrinks {
    KitchenMenu food = MANHATTAN;

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");

    }
    public String getName(){
        return food.getName();
    }

}

