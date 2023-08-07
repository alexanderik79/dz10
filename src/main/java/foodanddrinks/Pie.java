package foodanddrinks;

import restaurant.KitchenMenu;

import static restaurant.KitchenMenu.PIE;

public class Pie {

    KitchenMenu food = PIE;
    public void info(){System.out.println(food.getName()+" (" + food.getPrice()+")");};

    public void IsReady() {
        System.out.println(food.getName()+" (" + food.getComposition()+")");
    }
    public String getName(){
        return food.getName();
    }
}
