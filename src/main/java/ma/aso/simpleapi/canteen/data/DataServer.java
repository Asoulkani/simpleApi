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
        dishes.add(new Dishes("Harira soup", "30 MAD", true));
        dishes.add(new Dishes("Vegetable couscous", "50 MAD", true));
        dishes.add(new Dishes("Lamb couscous", "75 MAD", false));
        dishes.add(new Dishes("Beef tagine", "80 MAD", false));
        dishes.add(new Dishes("Kefta tagine", "65 MAD", false));
        dishes.add(new Dishes("Vegetable tagine", "55 MAD", true));
        dishes.add(new Dishes("Fish tagine", "85 MAD", false));
        dishes.add(new Dishes("Chicken pastilla", "70 MAD", false));
        dishes.add(new Dishes("Seafood pastilla", "90 MAD", false));
        dishes.add(new Dishes("Zaalouk", "25 MAD", true));
        dishes.add(new Dishes("Taktouka", "25 MAD", true));
        dishes.add(new Dishes("Moroccan salad", "30 MAD", true));
        dishes.add(new Dishes("Tabbouleh", "35 MAD", true));
        dishes.add(new Dishes("Greek salad", "40 MAD", true));
        dishes.add(new Dishes("Caesar salad", "45 MAD", false));
        dishes.add(new Dishes("Falafel wrap", "40 MAD", true));
        dishes.add(new Dishes("Chicken wrap", "45 MAD", false));
        dishes.add(new Dishes("Tuna sandwich", "35 MAD", false));
        dishes.add(new Dishes("Cheese sandwich", "30 MAD", true));
        dishes.add(new Dishes("Club sandwich", "50 MAD", false));
        dishes.add(new Dishes("Merguez sandwich", "40 MAD", false));
        dishes.add(new Dishes("Shawarma plate", "55 MAD", false));
        dishes.add(new Dishes("Grilled chicken", "60 MAD", false));
        dishes.add(new Dishes("Grilled salmon", "95 MAD", false));
        dishes.add(new Dishes("Fried sardines", "50 MAD", false));
        dishes.add(new Dishes("Fish and chips", "65 MAD", false));
        dishes.add(new Dishes("Shrimp pasta", "70 MAD", false));
        dishes.add(new Dishes("Vegetable pasta", "45 MAD", true));
        dishes.add(new Dishes("Spaghetti bolognese", "55 MAD", false));
        dishes.add(new Dishes("Penne arrabbiata", "45 MAD", true));
        dishes.add(new Dishes("Mushroom risotto", "60 MAD", true));
        dishes.add(new Dishes("Chicken risotto", "65 MAD", false));
        dishes.add(new Dishes("Vegetable fried rice", "40 MAD", true));
        dishes.add(new Dishes("Chicken fried rice", "50 MAD", false));
        dishes.add(new Dishes("Beef burger", "55 MAD", false));
        dishes.add(new Dishes("Veggie burger", "45 MAD", true));
        dishes.add(new Dishes("Chicken burger", "50 MAD", false));
        dishes.add(new Dishes("Cheese pizza", "50 MAD", true));
        dishes.add(new Dishes("Margherita pizza", "45 MAD", true));
        dishes.add(new Dishes("Pepperoni pizza", "60 MAD", false));
        dishes.add(new Dishes("Vegetable pizza", "55 MAD", true));
        dishes.add(new Dishes("Chicken pizza", "60 MAD", false));
        dishes.add(new Dishes("French fries", "20 MAD", true));
        dishes.add(new Dishes("Sweet potato fries", "25 MAD", true));
        dishes.add(new Dishes("Onion rings", "25 MAD", true));
        dishes.add(new Dishes("Mashed potatoes", "20 MAD", true));
        dishes.add(new Dishes("Steamed vegetables", "25 MAD", true));
        dishes.add(new Dishes("Grilled vegetables", "30 MAD", true));
        dishes.add(new Dishes("Rice pilaf", "20 MAD", true));
        dishes.add(new Dishes("Buttered couscous", "20 MAD", true));
        dishes.add(new Dishes("Lentil soup", "30 MAD", true));
        dishes.add(new Dishes("Chicken soup", "35 MAD", false));
        dishes.add(new Dishes("Mushroom soup", "32 MAD", true));
        dishes.add(new Dishes("Pumpkin soup", "32 MAD", true));
        dishes.add(new Dishes("Onion soup", "30 MAD", true));
        dishes.add(new Dishes("Shakshuka", "40 MAD", true));
        dishes.add(new Dishes("Omelette", "25 MAD", true));
        dishes.add(new Dishes("Cheese omelette", "30 MAD", true));
        dishes.add(new Dishes("Msemen", "15 MAD", true));
        dishes.add(new Dishes("Baghrir", "15 MAD", true));
        dishes.add(new Dishes("Harcha", "12 MAD", true));
        dishes.add(new Dishes("Croissant", "12 MAD", true));
        dishes.add(new Dishes("Pain au chocolat", "14 MAD", true));
        dishes.add(new Dishes("Cheese croissant", "16 MAD", true));
        dishes.add(new Dishes("Avocado toast", "35 MAD", true));
        dishes.add(new Dishes("Yogurt parfait", "28 MAD", true));
        dishes.add(new Dishes("Fruit salad", "25 MAD", true));
        dishes.add(new Dishes("Pancakes", "30 MAD", true));
        dishes.add(new Dishes("Waffles", "32 MAD", true));
        dishes.add(new Dishes("Chocolate mousse", "28 MAD", true));
        dishes.add(new Dishes("Tiramisu", "35 MAD", true));
        dishes.add(new Dishes("Cheesecake", "35 MAD", true));
        dishes.add(new Dishes("Apple pie", "28 MAD", true));
        dishes.add(new Dishes("Brownies", "22 MAD", true));
        dishes.add(new Dishes("Cookies", "15 MAD", true));
        dishes.add(new Dishes("Baklava", "25 MAD", true));
        dishes.add(new Dishes("Sellou", "20 MAD", true));
        dishes.add(new Dishes("Ghriba", "15 MAD", true));
        dishes.add(new Dishes("Kaab el ghazal", "20 MAD", true));
        dishes.add(new Dishes("Rice pudding", "18 MAD", true));
        dishes.add(new Dishes("Ice cream scoop", "15 MAD", true));
        dishes.add(new Dishes("Espresso", "12 MAD", true));
        dishes.add(new Dishes("Cafe au lait", "16 MAD", true));
        dishes.add(new Dishes("Cappuccino", "18 MAD", true));
        dishes.add(new Dishes("Orange juice", "18 MAD", true));
        dishes.add(new Dishes("Apple juice", "16 MAD", true));
        dishes.add(new Dishes("Lemonade", "15 MAD", true));
        dishes.add(new Dishes("Sparkling water", "10 MAD", true));
        dishes.add(new Dishes("Still water", "8 MAD", true));
        dishes.add(new Dishes("Smoothie bowl", "40 MAD", true));
        dishes.add(new Dishes("Quinoa bowl", "48 MAD", true));
        dishes.add(new Dishes("Chicken bowl", "55 MAD", false));
        dishes.add(new Dishes("Tofu stir fry", "45 MAD", true));
        dishes.add(new Dishes("Beef kebab", "60 MAD", false));
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
