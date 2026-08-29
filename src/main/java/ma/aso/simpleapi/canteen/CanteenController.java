package ma.aso.simpleapi.canteen;

import ma.aso.simpleapi.canteen.data.Dishes;
import ma.aso.simpleapi.canteen.data.User;
import ma.aso.simpleapi.canteen.data.dto.AuthenticateReq;
import ma.aso.simpleapi.canteen.data.dto.UserResp;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/canteen")
public class CanteenController {

    private final CanteenService canteenService;

    public CanteenController(CanteenService canteenService){
        this.canteenService = canteenService;
    }

    @PostMapping("/login")
    public UserResp authenticateUser(@RequestBody AuthenticateReq authenticateReq){
        Optional<User> user = canteenService.authenticateUser(authenticateReq.email(), authenticateReq.password());
        return new UserResp(user.isPresent(), user.orElse(null));
    }

    @PostMapping("/updateUser")
    public UserResp updateUser(@RequestBody User user){
        Optional<User> updatedUser = canteenService.updateUser(user);
        return new UserResp( updatedUser.isPresent(), updatedUser.orElse(null));
    }

    @GetMapping("/dishes")
    public ArrayList<Dishes> getDishes() {
        return canteenService.getAllDishes();
    }
}
