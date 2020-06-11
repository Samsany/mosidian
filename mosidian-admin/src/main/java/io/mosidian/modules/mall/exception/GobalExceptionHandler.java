package io.mosidian.modules.mall.exception;

import io.mosidian.modules.mall.enums.ResponseEnum;
import io.mosidian.modules.mall.utils.ErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname GobalExceptionHandler
 * @Description 我们只需要在类上加上@ControllerAdvice注解这个类就成为了全局异常处理类
 * 当然你也可以通过 assignableTypes指定特定的 Controller 类
 * 让异常处理类只处理特定类抛出的异常。
 * @Date 2020/3/23 10:39
 * @Author ZSY
 */
@ResponseBody
//@ControllerAdvice(assignableTypes = {UserController.class})
@ControllerAdvice
public class GobalExceptionHandler {

    // 也可以将 BaseException 换为 RuntimeException
    // 因为 RuntimeException 是 BaseException 的父类
    @ExceptionHandler(BaseException.class)
    public ResponseEntity<?> handleAppException(BaseException ex, HttpServletRequest request) {
        ErrorResponse representation = new ErrorResponse(ex, request.getRequestURI());
        return new ResponseEntity<>(representation, new HttpHeaders(), ex.getError().getStatus());
    }

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request) {
        ErrorResponse errorReponse = new ErrorResponse(ex, request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorReponse);
    }

    @ExceptionHandler(value = MallException.class)
    public ResponseEntity<ErrorResponse> handleMallException(MallException ex, HttpServletRequest request) {

        ErrorResponse errorReponse = new ErrorResponse(ex, request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorReponse);
    }

    /**
     * 统一表单验证
     *
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        BindingResult bindingResult = e.getBindingResult();
        ErrorResponse errorReponse = new ErrorResponse(bindingResult, ResponseEnum.PARAM_ERROR, request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorReponse);
    }


}
