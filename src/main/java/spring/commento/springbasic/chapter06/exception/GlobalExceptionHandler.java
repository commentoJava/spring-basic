package spring.commento.springbasic.chapter06.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ErrorResponse illegal(IllegalArgumentException e) {
        log.error("\n errorr = ", e);
        return new ErrorResponse(HttpStatus.BAD_REQUEST.name(), e.getMessage());
    }

    @ExceptionHandler
    public ResponseEntity<?> productExceptionHandler(ProductException e) {
        log.error("\n ProductException ex = ", e);
        return new ResponseEntity<>(new ErrorResponse("ex", e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler
    public ErrorResponse runtimeExceptionHandler(RuntimeException e) {
        log.error("\n RuntimeException ex = ", e);
        return new ErrorResponse("no", e.getMessage());
    }
}
