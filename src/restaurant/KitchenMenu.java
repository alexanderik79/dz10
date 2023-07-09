package restaurant;

public enum KitchenMenu implements Comparable<KitchenMenu>{
    CAKE("Cake", 100.20,1,"food", "cottage, cream, sugar"),
    SALAD("Salad", 150.55,2,"food", "cucumber, tomato, pepper, salt"),
    POTATO("Potato",56.00,3, "food", "potato, pepper, salt"),
    BEEF("Beef",250.00,4,"food", "beef, pepper, salt"),
    BLOODYMARY("Bloody Mary",100.50, 5, "drinks", "vodka, tomato juice"),
    MARGARITTA("Margaritta",110.00, 6, "drinks", "vodka, orange juice"),
    GORDONPINK("Gordon Pink",150.70, 7, "drinks", "jin gordon, limonade"),
    MANHATTAN("Manhattan",80.10, 8, "drinks", "rum, cola"),
    COLA("Cola",50.60, 9, "drinks", "cola");

    String name;
    int number;
    String comosition;
    String type;
    double price;
    public double getPrice() {
        return price;
    }
    KitchenMenu(String name, double price, int number, String type, String composition) {
        this.name = name;
        this.number = number;
        this.comosition = composition;
        this.type =type;
        this.price = price;
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
    public int compareByPrice(KitchenMenu k) {
        return price > k.getPrice() ? 1 : (price == k.getPrice() ? 0 : -1);
    }
}