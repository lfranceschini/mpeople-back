package com.micropole.mpeople.exception;

/**
 * Created by lfranceschini on 29/03/2017.
 */
public class NoDataFoundException extends Exception {

        public NoDataFoundException(){
            super();
        }

        public NoDataFoundException(String message){
            super(message);
        }

        public NoDataFoundException(String message, Throwable throwable){
            super(message, throwable);
        }
}
