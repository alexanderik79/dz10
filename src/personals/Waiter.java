package personals;

import restaurant.DeleteOldOrders;
import restaurant.Hall;
import restaurant.KitchenMenu;
import restaurant.OrderFood;
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
        Scanner scannerint = new Scanner(System.in);

        String meal;
        String yesNo = "";
        int quantity = 0;

        while (true) {
            if("n".equals(yesNo)||"N".equals(yesNo)){break;}
            meal = scanner.nextLine();
            meal = CaseInSensitivity(meal);
            if (isExist(meal)) {
                for (KitchenMenu food : KitchenMenu.values()
                ) {
                    if (food.getName().equals(meal)) {
                        System.out.println(name + ": " + "How much "+meal+"?");
                        quantity = scannerint.nextInt();
                        orderFood.makeOrder(food.getNumber(), quantity, "kitchen");
                        orderFood.makeOrderToClient(quantity, meal);
                        System.out.println(name + ": " + "Anything else? y/n");
                        yesNo = scanner.nextLine();
                        if("n".equals(yesNo)||"N".equals(yesNo)){break;}
                        else if("y".equals(yesNo)||"Y".equals(yesNo)) {
                            System.out.println(name + ": What else?");
                        }
                    }
                }
            }else {System.out.println(name + ": Sorry, we don`t have it.\n Want something else?");}
        }
    }
    public void starting2() {
        OrderFood orderFood = new OrderFood(table);

        System.out.println(name +": "+ "Wanna drink?. Please make a choice\n__________________________________");
        for (KitchenMenu food : KitchenMenu.values()
        ) {
            if (food.getType().equals("drinks")) {
                System.out.println(food.getNumber() + "." + food.getName());
            }
        }
        Scanner scanner = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);

        String meal;
        String yesNo = "";
        int quantity = 0;

        while (true) {
            if("n".equals(yesNo)||"N".equals(yesNo)){
                System.out.println(name+ ": OK. It will takes 10 minutes");
                break;}
            meal = scanner.nextLine();
            meal = CaseInSensitivity(meal);
            System.out.println(meal);
            if (isExist(meal)) {
                for (KitchenMenu food : KitchenMenu.values()
                ) {
                    if (food.getName().equals(meal)) {
                        System.out.println(name + ": " + "How much "+meal+"?");
                        quantity = scannerint.nextInt();
                        orderFood.makeOrder(food.getNumber(), quantity, "bar");
                        orderFood.makeOrderToClient(quantity, meal);
                        System.out.println(name + ": " + "Anything else? y/n");
                        yesNo = scanner.nextLine();
                        if("n".equals(yesNo)||"N".equals(yesNo)){break;}
                        else if("y".equals(yesNo)||"Y".equals(yesNo)) {
                            System.out.println(name + ": What else?");
                        }
                    }
                }
            }else {System.out.println(name + ": Sorry, we don`t have it.\n Want something else?");}
        }
    }
    public boolean isExist (String meal){
        boolean exist = false;
        for (KitchenMenu food : KitchenMenu.values()
        ) {
            if ((food.getName().equals(meal))) {
                exist = true;
            }
        }
        return exist;
    }
    public String CaseInSensitivity (String meal){
        meal = meal.toLowerCase();
        meal = meal.substring(0, 1).toUpperCase() + meal.substring(1);
        return meal;
    }
}