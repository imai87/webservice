package br.com.universidade.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMethodException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public UnsuportedMethodException(String exception){
        super(exception);
    }

}
