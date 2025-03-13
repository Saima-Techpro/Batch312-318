package day30customexceptions;

public class InvalidStudentGradeException extends Exception{
    // By establishing inheritance, we ensure that this class that we are creating, will work as an exception


    public InvalidStudentGradeException (String message){
        super(message);
    }


}
