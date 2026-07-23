package io.github.ronycce445.notification_hub.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleValidateExceptions(MethodArgumentNotValidException ex){
        Map<String, String> map = new HashMap<>();
        ex.getBindingResult().getFieldErrors()
                .forEach(fieldError ->
                        map.put(fieldError.getField(), fieldError.getDefaultMessage())
                );
        return map;
    }
}
