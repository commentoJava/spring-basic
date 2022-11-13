package spring.commento.springbasic.chapter06.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chap06")
@Slf4j
public class ExceptionControllerV1 {

//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(IllegalArgumentException.class)
//    public ErrorResponse illegal(IllegalArgumentException e){
//        log.error("\n errorr = ",e);
//        return new ErrorResponse(HttpStatus.BAD_REQUEST.name(),e.getMessage());
//    }
//
//    @ExceptionHandler
//    public ResponseEntity<?> productExceptionHandler(ProductException e){
//        log.error("\n ProductException ex = ", e);
//        return new ResponseEntity<>(new ErrorResponse("ex",e.getMessage()),HttpStatus.BAD_REQUEST);
//    }
//
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler
//    public ErrorResponse runtimeExceptionHandler(RuntimeException e){
//        log.error("\n RuntimeException ex = ",e);
//        return new ErrorResponse("no",e.getMessage());
//    }

    @GetMapping("/product/{name}")
    public ProductDto getProduct(@PathVariable String name){
        if(name.equals("no"))
            throw new RuntimeException("잘못된 상품명입니다");
        else if(name.equals("bad"))
            throw new IllegalArgumentException("잘못된 고객 요청");
        else if(name.equals("ex"))
            throw new ProductException("상품 오류입니다 ");
        return new ProductDto("상품이름1", "상품 ID1");
    }


    @AllArgsConstructor
    @Getter
    @NoArgsConstructor
    static class ProductDto{
        private String productName;
        private String productId;
    }
}
