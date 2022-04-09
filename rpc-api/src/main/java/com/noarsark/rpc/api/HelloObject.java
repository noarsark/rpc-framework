package com.noarsark.rpc.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 测试用api的实体
 * @author noarsark
 */
@Data
@AllArgsConstructor
public class HelloObject implements Serializable {

    private Integer id;
    private String message;

}
