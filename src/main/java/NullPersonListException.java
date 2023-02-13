/**
 * This class is used to throw an exception when the person list is null.
 *
 * @author Miguel Angel Cosano Ramirez
 */
public class NullPersonListException extends RuntimeException{
    public NullPersonListException(String errorMessage){
        super(errorMessage);
    }
}
