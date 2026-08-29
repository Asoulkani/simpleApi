package ma.aso.simpleapi.canteen.data.dto;

import ma.aso.simpleapi.canteen.data.User;

public record UserResp(boolean authenticated, User user) {
}
