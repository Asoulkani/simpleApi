package ma.aso.simpleapi.canteen;

import ma.aso.simpleapi.canteen.data.DataServer;
import ma.aso.simpleapi.canteen.data.Dishes;
import ma.aso.simpleapi.canteen.data.User;
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

    public Optional<User> authenticateUser(String email, String password) {
        log.debug("Authenticating user {}", email);
        return dataServer.findByEmailAndPassword(email, password);
    }

    public Optional<User> getUser(String email) {
        return Optional.ofNullable(dataServer.findByEmail(email));
    }

    public Optional<User> updateUser(User user) {
        return dataServer.replaceUser(user);
    }

    public ArrayList<Dishes> getAllDishes() {
        return dataServer.allDishes();
    }
}
