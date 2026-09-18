package ma.aso.simpleapi.canteen.data.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import ma.aso.simpleapi.canteen.data.Order;

import java.util.ArrayList;
@Schema
public record UserReq(String name, String email, ArrayList<Order> orders) {
}
