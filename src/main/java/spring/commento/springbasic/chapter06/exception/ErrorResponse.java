package spring.commento.springbasic.chapter06.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private String statusCode;
    private String message;
}
