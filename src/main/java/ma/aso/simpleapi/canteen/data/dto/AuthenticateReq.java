package ma.aso.simpleapi.canteen.data.dto;

import java.io.Serializable;

public record AuthenticateReq(String email, String password) implements Serializable {
}
