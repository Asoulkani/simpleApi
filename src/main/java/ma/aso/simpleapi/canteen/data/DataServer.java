package ma.aso.simpleapi.canteen.data;

import jakarta.annotation.PostConstruct;
import ma.aso.simpleapi.canteen.data.dto.UserReq;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class DataServer {
    private ArrayList<User> users = new ArrayList<>() ;
    private ArrayList<Dishes> dishes = new ArrayList<>() ;

    @PostConstruct
    public void init() {
        loadData();
    }

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

    public User findByEmail(String email){
        return users.stream().filter(user -> user.email().equals(email)).findFirst().orElse(null);
    }

    public Optional<User> findByEmailAndPassword(String email, String password){
        return users.stream().filter(user -> user.email().equals(email) && user.password().equals(password)).findFirst();
    }

    public Optional<User> replaceUser(User userReq){
        User existing = findByEmail(userReq.email());
        if (existing == null) {
            return Optional.empty();
        }
        User updated = new User(
                userReq.name(),
                userReq.email(),
                existing.password(),  // never take password from the request
                userReq.orders()
        );
        users.replaceAll(user -> user.email().equals(userReq.email()) ? updated : user);
        return Optional.of(updated);
    }

    public ArrayList<Dishes> allDishes() {
        return dishes;
    }
}
