package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.SALAD;
public class Salad extends FoodAndDrinks {
    KitchenMenu food = SALAD;

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }
}
