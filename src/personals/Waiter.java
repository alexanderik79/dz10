package personals;

import restaurant.Hall;
import restaurant.KitchenMenu;
import restaurant.OrderFood;

import java.io.File;
import java.util.*;


public class Waiter {
    String name;
    String table;

    public Waiter(String name) {this.name = name;}


    public void reserveTable() {
        table = Hall.getTable();
    }


    public void bringFood(String food, String table) {
        System.out.println(name +": "+ food + " is ready. I am bringing you a dish to the " + table);
    }

    public void greeting() {
        System.out.println(name +": "+ "Welcome. My name is " + name + " i will service you");
    }

    public void preparing() {
        System.out.println(name +": "+ "Please sit at the " + table);
    }

    public void starting() {
        OrderFood orderFood = new OrderFood(table);

        System.out.println(name +": "+ "Here is a menu. Please make a choice\n__________________________________");
        for (KitchenMenu food : KitchenMenu.values()
        ) {
            if(food.getType().equals("food")) {
                System.out.println(food.getNumber() + "." + food.getName());
            }
        }
        Scanner scanner = new Scanner(System.in);
        String meal;

        while (scanner.hasNext() == true) {
            meal = scanner.nextLine();
            for (KitchenMenu food : KitchenMenu.values()
            ) {
                if (food.getName().equals(meal)) {
                    System.out.println(name +": "+ "How much?");
                    int quantity = scanner.nextInt();
                    orderFood.makeOrder(food.getNumber(), quantity, "kitchen");
                    orderFood.makeOrderToClient(quantity, meal);
                    System.out.println(name +": "+ "Anything else? y/n");
                     if (scanner.nextLine().equals("y")) {
                        System.out.println(name +": "+ "What else?");
                    } else {
                        break;
                    }
                }
            }
            if (meal.equals("n")){
                System.out.println(name +": "+ "Thank you. Your order is:\n_____________________________");
                orderFood.printOrder();
                break;
            }
        }
    }
    public void starting2() {
        OrderFood orderFood = new OrderFood(table);

        System.out.println(name +": "+ "Here is a Bar menu. Please make a choice\n__________________________________");
        for (KitchenMenu food : KitchenMenu.values()
        ) {
            if (food.getType().equals("drinks")) {
                System.out.println(food.getNumber() + "." + food.getName());
            }
        }
        Scanner scanner = new Scanner(System.in);
        String meal;

        while (scanner.hasNext() == true) {
            meal = scanner.nextLine();
            for (KitchenMenu food : KitchenMenu.values()
            ) {
                if (food.getName().equals(meal)) {
                    System.out.println(name +": "+ "How much?");
                    int quantity = scanner.nextInt();
                    orderFood.makeOrder(food.getNumber(), quantity, "bar");
                    orderFood.makeOrderToClient(quantity, meal);
                    System.out.println(name +": "+ "Anything else? y/n");
                    if (scanner.nextLine().equals("y")) {
                        System.out.println(name +": "+ "What else?");
                    } else {
                        break;
                    }
                }
            }
            if (meal.equals("n")){
                System.out.println(name +": "+ "Thank you. Your order is:\n_____________________________");
                orderFood.printOrder();
                System.out.println("It will take some minutes");
                break;
            }
        }
    }
}