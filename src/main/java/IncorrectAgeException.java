/**
 * Class used to throw exceptions when there is an error with the age.
 *
 * @author Miguel Angel Cosano Ramirez
 */
public class IncorrectAgeException extends RuntimeException{

    public IncorrectAgeException(String errorMessage){
        super(errorMessage);
    }
}
