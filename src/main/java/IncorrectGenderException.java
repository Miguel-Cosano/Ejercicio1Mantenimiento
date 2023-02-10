/**
 * Class used to throw exceptions when there is an error with the gender.
 *
 * @author Miguel Angel Cosano Ramirez
 */
public class IncorrectGenderException extends RuntimeException{
    public IncorrectGenderException(String errorMessage){
        super(errorMessage);
    }
}
