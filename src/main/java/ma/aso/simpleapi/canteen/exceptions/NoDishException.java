package ma.aso.simpleapi.canteen.exceptions;

public class NoDishException extends RuntimeException {
    public NoDishException(String message) {
        super(message);
    }
}
