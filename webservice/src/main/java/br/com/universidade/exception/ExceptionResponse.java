package br.com.universidade.exception;

import java.io.Serializable;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String timeStamp;
    private String messege;
    private String details;

    public ExceptionResponse(String timeStamp, String messege, String details) {
        this.timeStamp = timeStamp;
        this.messege = messege;
        this.details = details;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getMessege() {
        return messege;
    }

    public String getDetails() {
        return details;
    }
}
