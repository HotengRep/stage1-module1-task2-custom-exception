package com.epam.mjc;

/**
 * StudentOutIdException  will be used for the StudentManager class
 * If ID is out of the allowed range,this exception is raised
 */
public class StudentOutIdException extends IllegalArgumentException {


    /**
     *
     * @param message is used to pass error message
     */
    public StudentOutIdException(String message){super(message);}
}
