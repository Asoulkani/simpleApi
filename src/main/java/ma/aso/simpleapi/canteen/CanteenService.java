package ma.aso.simpleapi.canteen;

import ma.aso.simpleapi.canteen.data.DataServer;
import ma.aso.simpleapi.canteen.data.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CanteenService {

    private static final Logger log = LoggerFactory.getLogger(CanteenService.class);
    private final DataServer dataServer;

    public CanteenService(DataServer dataServer) {
        this.dataServer = dataServer;
        dataServer.loadData();
    }

    public Optional<User> authenticateUser(String username, String password) {
        log.debug("Authenticating user {}", username);
        return dataServer.users.stream().filter(user -> user.username().equals(username) && (user.password().equals(password))).findFirst();
    }

    public boolean updateUser(User user) {
        dataServer.users.replaceAll(user1 -> user1.username().equals(user.username()) ? user : user1);
        // true means its actually gotten persisted in the db
        log.debug("username : {}", dataServer.users.get(0).username());
        dataServer.users.get(0).orders().forEach(order -> {
            log.debug("dish name : {}", order.dishes().name());
        });
        return true;
    }
}
