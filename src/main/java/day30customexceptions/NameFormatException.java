package day30customexceptions;

public class NameFormatException extends Exception{
    // By establishing inheritance, we ensure that this class that we are creating, will work as an exception

    public NameFormatException(String message){
        super(message);
    }
}
