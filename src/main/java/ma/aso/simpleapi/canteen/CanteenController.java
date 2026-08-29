package ma.aso.simpleapi.canteen;

import ma.aso.simpleapi.canteen.data.User;
import ma.aso.simpleapi.canteen.data.dto.AuthenticateReq;
import ma.aso.simpleapi.canteen.data.dto.UserResp;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("Canteen/api/v1")
public class CanteenController {

    private final CanteenService canteenService;

    public CanteenController(CanteenService canteenService){
        this.canteenService = canteenService;
    }

    @PostMapping("/login")
    public UserResp authenticateUser(@RequestBody AuthenticateReq authenticateReq){
        Optional<User> user = canteenService.authenticateUser(authenticateReq.username(), authenticateReq.password());
        return new UserResp(user.isPresent(), user.orElse(null));
    }

    @PostMapping("/updateUser")
    public UserResp updateUser(@RequestBody User user){
        return new UserResp( canteenService.updateUser(user), user);
    }
}
