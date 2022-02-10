package com.noarsark.rpc.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author noarsark
 */
@Data
@AllArgsConstructor
public class HelloObject implements Serializable {

    private Integer id;
    private String message;

}
