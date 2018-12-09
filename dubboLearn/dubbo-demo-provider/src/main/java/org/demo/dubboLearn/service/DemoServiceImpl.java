package org.demo.dubboLearn.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.alibaba.dubbo.rpc.RpcContext;
import org.demo.dubboLearn.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
