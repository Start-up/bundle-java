package com.akveo.bundlejava.authentication.exception;

import com.akveo.bundlejava.exception.HttpException;
import org.springframework.http.HttpStatus;

public class UserAlreadyExistsHttpException extends HttpException {
    private static final long serialVersionUID = -5202433948475658078L;

    public UserAlreadyExistsHttpException() {
        super("Email is invalid or already taken", HttpStatus.CONFLICT);
    }
}
