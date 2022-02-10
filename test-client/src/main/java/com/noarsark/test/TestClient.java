package com.noarsark.test;

import com.noarsark.rpc.api.HelloObject;
import com.noarsark.rpc.api.HelloService;
import com.noarsark.rpc.client.RpcClientProxy;

/**
 * 测试用消费者(客户端)
 * @author noarsark
 */
public class TestClient {
    public static void main(String[] args) {
        RpcClientProxy proxy = new RpcClientProxy("127.0.0.1", 9000);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }
}
