package ma.aso.simpleapi.canteen.data.dto;

import ma.aso.simpleapi.canteen.data.User;

public record UserResp(boolean success, User user) {
    public UserResp(boolean success, User user) {
        this.success = success;
        if(user == null)
            this.user = new User();
        else
            this.user = new User(user.name(), user.email(), "", user.orders());
    }
}
