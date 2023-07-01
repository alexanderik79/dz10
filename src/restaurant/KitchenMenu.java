package restaurant;

public enum KitchenMenu {
    CAKE("Cake",1,"food", "cottage, cream, sugar"),
    SALAD("Salad",2,"food", "cucumber, tomato, pepper, salt"),
    POTATO("Potato",3, "food", "potato, pepper, salt"),
    BEEF("Beef",4,"food", "beef, pepper, salt"),
    BLOODYMARY("Bloody Mary", 5, "drinks", "vodka, tomato juice"),
    MARGARITTA("Margaritta", 6, "drinks", "vodka, orange juice"),
    GORDONPINK("Gordon Pink", 7, "drinks", "jin gordon, limonade"),
    MANHATTAN("Manhattan", 8, "drinks", "rum, cola"),
    COLA("Cola", 9, "drinks", "cola");

    String name;
    int number;
    String comosition;
    String type;
    KitchenMenu(String name, int number, String type, String composition) {
        this.name = name;
        this.number = number;
        this.comosition = composition;
        this.type =type;
    }
    public String getName (){
        return name;
    }
    public String getComposition (){
        return comosition;
    }
    public int getNumber (){
        return number;
    }
    public String getType (){
        return type;
    }
    public String getNameByNumber (int number){
        for (KitchenMenu meal: KitchenMenu.values()
             ) {
            if (meal.getNumber() == number)return meal.getName();
        }
        return "name";
    }
}
