/**
 * Class used to throw exceptions when there is an error with the name.
 *
 * @author Miguel Angel Cosano Ramirez
 */
public class IncorrectNameException extends RuntimeException{
    public IncorrectNameException(String errorMessage){
        super(errorMessage);
    }
}
