package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.BLOODYMARY;

public class BloodyMary extends FoodAndDrinks {
    KitchenMenu food = BLOODYMARY;

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }

}

