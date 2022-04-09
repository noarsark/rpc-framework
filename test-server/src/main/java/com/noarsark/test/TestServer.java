package com.noarsark.test;

import com.noarsark.rpc.api.HelloService;
import com.noarsark.rpc.registry.DefaultServiceRegistry;
import com.noarsark.rpc.registry.ServiceRegistry;
import com.noarsark.rpc.server.RpcServer;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        RpcServer rpcServer = new RpcServer(serviceRegistry);
        rpcServer.start(9000);
    }
}
