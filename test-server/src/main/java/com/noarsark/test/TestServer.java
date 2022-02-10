package com.noarsark.test;

import com.noarsark.rpc.api.HelloService;
import com.noarsark.rpc.server.RpcServer;

public class TestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.register(helloService, 9000);
    }
}
