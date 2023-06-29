package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.GORDONPINK;

public class GordonPink extends FoodAndDrinks {
    KitchenMenu food = GORDONPINK;

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }

}
