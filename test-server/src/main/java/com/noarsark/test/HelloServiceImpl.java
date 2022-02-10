package com.noarsark.test;

import com.noarsark.rpc.api.HelloObject;
import com.noarsark.rpc.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author noarsark
 */
public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到: {}", object.getMessage());
        return "这是调用的返回值, id = " + object.getId();
    }
}
