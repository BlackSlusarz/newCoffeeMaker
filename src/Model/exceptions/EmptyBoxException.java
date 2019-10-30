package Model.exceptions;

public class EmptyBoxException extends Throwable {

    public EmptyBoxException(String nameOfProduct){
        super ("Out of product: " + nameOfProduct);
    }
}
