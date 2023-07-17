import restaurant.Hall;
import restaurant.Service;

public class Main {
    public static void main(String[] args) {
        Hall.openHall();
        Service service = new Service();
        service.start(3); // количество столов к обслуживанию (мах 10)
    }
}

