import restaurant.Hall;
import restaurant.Service;

public class Main {
    public static void main(String[] args) {
        Hall.openHall(2);
        Service service = new Service();
        service.start();
    }
}

