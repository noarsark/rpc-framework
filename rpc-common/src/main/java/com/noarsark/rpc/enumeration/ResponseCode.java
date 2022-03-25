package com.noarsark.rpc.enumeration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 方法调用的响应状态码
 * @author noarsark
 */
@AllArgsConstructor
@Getter
public enum ResponseCode {
    /**
     * SUCCESS 成功
     */
    SUCCESS(200, "调用方法成功"),
    FAIL(500, "调用方法失败"),
    METHOD_NOT_FOUND(500, "未找到指定方法"),
    CLASS_NOT_FOUND(500, "未找到指定类");

    private final int code;
    private final String message;
}
