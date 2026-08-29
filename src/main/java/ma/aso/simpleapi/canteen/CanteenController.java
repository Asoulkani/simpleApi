package ma.aso.simpleapi.canteen;

import ma.aso.simpleapi.canteen.data.Dishes;
import ma.aso.simpleapi.canteen.data.User;
import ma.aso.simpleapi.canteen.data.dto.AuthenticateReq;
import ma.aso.simpleapi.canteen.data.dto.UserReq;
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
        return canteenService.authenticateUser(authenticateReq.email(), authenticateReq.password());
    }

    @PostMapping("/updateUser")
    public UserResp updateUser(@RequestBody UserReq user){
        return canteenService.updateUser(user);
    }

    @GetMapping("/dishes")
    public ArrayList<Dishes> getDishes() {
        return canteenService.getAllDishes();
    }
}
