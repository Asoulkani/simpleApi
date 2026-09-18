package ma.aso.simpleapi.canteen;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import ma.aso.simpleapi.canteen.data.Dishes;
import ma.aso.simpleapi.canteen.data.User;
import ma.aso.simpleapi.canteen.data.dto.AuthenticateReq;
import ma.aso.simpleapi.canteen.data.dto.UserReq;
import ma.aso.simpleapi.canteen.data.dto.UserResp;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Tag(name = "canteen", description = "the canteen api")
@RestController
@RequestMapping("/api/v1/canteen")
public class CanteenController {

    private final CanteenService canteenService;

    public CanteenController(CanteenService canteenService){
        this.canteenService = canteenService;
    }

    @PostMapping("/login")
    @Operation(summary = "authenticate a user")
    @ApiResponse(responseCode = "200", description = "operation Done")
    public UserResp authenticateUser(@RequestBody AuthenticateReq authenticateReq){
        return canteenService.authenticateUser(authenticateReq.email(), authenticateReq.password());
    }

    @PostMapping("/updateUser")
    @Operation(summary = "update a user - mostly used to update orders")
    @ApiResponse(responseCode = "200", description = "updated")
    public UserResp updateUser(@RequestBody UserReq user){
        return canteenService.updateUser(user);
    }

    @GetMapping("/dishes")
    @Operation(summary = "list of all the dishes")
    @ApiResponse(responseCode = "200", description = "all dishes OK")
    public ArrayList<Dishes> getDishes() {
        return canteenService.getAllDishes();
    }
}
