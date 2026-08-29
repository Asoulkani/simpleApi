package ma.aso.simpleapi.canteen;

import ma.aso.simpleapi.canteen.data.DataServer;
import ma.aso.simpleapi.canteen.data.Dishes;
import ma.aso.simpleapi.canteen.data.User;
import ma.aso.simpleapi.canteen.data.dto.UserReq;
import ma.aso.simpleapi.canteen.data.dto.UserResp;
import ma.aso.simpleapi.canteen.data.dto.UserView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CanteenService {

    private static final Logger log = LoggerFactory.getLogger(CanteenService.class);
    private final DataServer dataServer;

    public CanteenService(DataServer dataServer) {
        this.dataServer = dataServer;
    }

    public UserResp authenticateUser(String email, String password) {
        log.debug("Authenticating user {}", email);
        Optional<User> user = dataServer.findByEmailAndPassword(email, password);
        return user.map(value -> new UserResp(true, new UserView(value.name(), value.email(), value.orders()))).orElseGet(() -> new UserResp(false, null));
    }

    public Optional<User> getUser(String email) {
        return Optional.ofNullable(dataServer.findByEmail(email));
    }

    public UserResp updateUser(UserReq user) {
        Optional<User> updatedUser = dataServer.replaceUser(user);
        return updatedUser.map(value -> new UserResp(true, new UserView(value.name(), value.email(), value.orders()))).orElseGet(() -> new UserResp(false, null));
    }

    public ArrayList<Dishes> getAllDishes() {
        return dataServer.allDishes();
    }
}
