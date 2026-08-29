package ma.aso.simpleapi.canteen.data.dto;

import ma.aso.simpleapi.canteen.data.Order;

import java.util.ArrayList;

public record UserView(String name, String email, ArrayList<Order> orders) {
}
