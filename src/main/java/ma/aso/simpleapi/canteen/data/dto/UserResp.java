package ma.aso.simpleapi.canteen.data.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema
public record UserResp(boolean success, UserView user) {
}
