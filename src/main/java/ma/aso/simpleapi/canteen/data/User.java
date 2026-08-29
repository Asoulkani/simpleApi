package ma.aso.simpleapi.canteen.data;

import java.util.ArrayList;

public record User(String name, String username, String password, ArrayList<Order> orders) {
}
