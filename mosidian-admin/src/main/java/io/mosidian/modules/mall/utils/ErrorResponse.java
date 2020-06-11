package io.mosidian.modules.mall.utils;

import io.mosidian.modules.mall.enums.ResponseEnum;
import io.mosidian.modules.mall.exception.BaseException;
import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.validation.BindingResult;

import java.time.Instant;
import java.util.Map;
import java.util.Objects;

/**
 * @Classname ErrorResponse
 * @Description 非必要的类，包装异常信息
 * @Date 2020/3/23 10:34
 * @Author ZSY
 */
@Data
public class ErrorResponse {

    private Integer code;
    private Integer status;
    private String message;
    private String path;
    private Instant timestamp;
    private Map<String, Object> data;

    public ErrorResponse() {
    }

    public ErrorResponse(BindingResult bindingResult, ResponseEnum responseEnum, String path) {

        this(responseEnum.getCode(), responseEnum.getStatus().value(),
                responseEnum.getMessage()
                        + ","
                        + Objects.requireNonNull(bindingResult.getFieldError()).getField()
                        + " "
                        + bindingResult.getFieldError().getDefaultMessage(), path);

    }

    public ErrorResponse(BaseException ex, String path) {
        this(ex.getError().getCode(), ex.getError().getStatus().value(), ex.getError().getMessage(), path, ex.getData());
    }

    public ErrorResponse(Integer code, Integer status, String message, String path) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.path = path;
    }

    public ErrorResponse(Integer code, Integer status, String message, String path, Map<String, Object> data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.path = path;
        this.timestamp = Instant.now();
        if (!ObjectUtils.isEmpty(data)) {
            // this.data.putAll(data);
            this.data = data;
        }
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "code=" + code +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", path='" + path + '\'' +
                ", timestamp=" + timestamp +
                ", data=" + data +
                '}';
    }
}
