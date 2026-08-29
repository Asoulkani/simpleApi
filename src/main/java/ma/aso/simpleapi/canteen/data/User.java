package ma.aso.simpleapi.canteen.data;

import java.util.ArrayList;

public record User(String name, String email, String password, ArrayList<Order> orders) {
    public User(){
        this("", "", "", null);
    }
}
