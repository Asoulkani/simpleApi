package ma.aso.simpleapi.canteen.data;

import ma.aso.simpleapi.canteen.exceptions.NoDishException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

@Component
public class DataServer {
    public ArrayList<User> users = new ArrayList<>() ;
    public ArrayList<Dishes> dishes = new ArrayList<>() ;

    public void loadData(){
        loadUsers();
        loadDishes();
        loadOrders();
    }

    public void loadUsers(){
        users.add(new User("Ada","ada@canteen.dev", "canteen", new ArrayList<>()));
        users.add(new User("Lin","Lin@canteen.dev", "canteen", new ArrayList<>()));
        users.add(new User("Sam","sam@canteen.dev", "canteen" , new ArrayList<>()));
    }

    public void loadDishes(){
        dishes.add(new Dishes("Tomato soup" ,"35 MAD", false));
        dishes.add(new Dishes("Hummus salad" ,"45 MAD", true));
        dishes.add(new Dishes("Chicken tagine" ,"70", false));
        dishes.add(new Dishes("Lentil salad" ,"40 MAD", true));
        dishes.add(new Dishes("Mint tea" ,"15 MAD", true));
        dishes.add(new Dishes("Orange cake" ,"25 MAD", true));
    }

    public void loadOrders(){
        users.get(0).orders().add(new Order(dishes.get(1), 2));
        users.get(0).orders().add(new Order(dishes.get(0), 1));
    }

}
