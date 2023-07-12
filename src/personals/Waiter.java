package personals;

import restaurant.Hall;
import restaurant.KitchenMenu;
import restaurant.OrderFood;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Waiter {
    String name;
    String table;

    public Waiter(String name) {this.name = name;}

    public String reserveTable() {
        Supplier<String> randomTable = () -> {return Hall.tables.get((int)(Math.random() * Hall.tables.size()));};
        table = randomTable.get();
        return table;
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

    public void filter (List<KitchenMenu> listFood, double priceLow, double priceHigh){
        List<KitchenMenu> listFood2 = listFood.stream()
                .filter(p -> (priceLow < p.getPrice())&&(priceHigh > p.getPrice()))
                .sorted(KitchenMenu::compareByPrice)
                .collect(Collectors.toList());
        for (KitchenMenu flf: listFood2
        ) {
            System.out.println(flf.getNumber() + "." + flf.getName()+ " - " + flf.getPrice()+ "грн.");
        }
    }

    public void starting(String type, OrderFood order) {
        String waiterSentense = null;
        String placeOfWork = null;
        String meal;
        String yesNo = "";
        int quantity = 0;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        List<KitchenMenu> listFood = new ArrayList<>();
        switch (type) {
            case "food" -> {
                waiterSentense = "Here is a menu. Please make a choice\n__________________________________";
                placeOfWork = "Kitchen";
            }
            case "drinks" -> {
                waiterSentense = "Wanna drink?. Please make a choice\n__________________________________";
                placeOfWork = "Bar";
            }
        }

        System.out.println(name +": "+ waiterSentense);
        for (KitchenMenu food : KitchenMenu.values()
        ) {
            if(food.getType().equals(type)) {
                System.out.println(food.getNumber() + "." + food.getName()+ " - " + food.getPrice()+ "грн.");
                listFood.add(food);
            }
        }
        System.out.println("__________________________________\nSorted by price\n__________________________________");
        filter(listFood, 0, 1000000);

        System.out.println("__________________________________\nDo you wanna filter by price? y/n");

        String yesNoFilter = scanner.nextLine();
        if("y".equals(yesNoFilter)||"Y".equals(yesNoFilter)) {
            System.out.println("Enter price starting from");
            int priceLow = scannerint.nextInt();
            System.out.println("Enter price up to");
            int priceHigh = scannerint.nextInt();
            filter(listFood, priceLow, priceHigh);
        }else{System.out.println("You are fckng rich! Please, make a choice, Sir");}

        while (true) {
            if("n".equals(yesNo)||"N".equals(yesNo)){
                if(type.equals("drinks")){
                    order.printOrder();
                    System.out.println(name+ ": OK. It will takes 10 minutes");
                }
                break;
            }
            meal = scanner.nextLine();
            meal = CaseInSensitivity(meal);
            if (isExist(meal)) {
                for (KitchenMenu food : KitchenMenu.values()
                ) {
                    if (food.getName().equals(meal)) {
                        System.out.println(name + ": " + "How much "+meal+"?");
                        quantity = scannerint.nextInt();
                        order.makeOrder(food.getNumber(), quantity, placeOfWork);
                        order.makeOrderToClient(meal, quantity);
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