package ma.aso.simpleapi.canteen.data.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

@Schema
public record AuthenticateReq(String email, String password) implements Serializable {
}
