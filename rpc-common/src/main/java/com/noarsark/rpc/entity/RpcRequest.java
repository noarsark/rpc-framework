package com.noarsark.rpc.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 消费者向提供者发送的请求对象
 * @author noarsark
 */
@Data
@Builder
public class RpcRequest implements Serializable {

    /**
     * 待调用的接口名称
     */
    private String interfaceName;

    /**
     * 待调用的方法名称
     */
    private String methodName;

    private Object[] parameters;

    private Class<?>[] paramTypes;
}
