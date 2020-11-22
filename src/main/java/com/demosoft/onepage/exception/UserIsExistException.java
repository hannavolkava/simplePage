package com.demosoft.onepage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Andrii_Korkoshko on 9/6/2016.
 */
@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="User Exist")
public class UserIsExistException extends IllegalArgumentException {
}
