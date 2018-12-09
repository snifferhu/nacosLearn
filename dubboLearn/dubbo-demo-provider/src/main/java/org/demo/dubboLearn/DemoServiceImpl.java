package org.demo.dubboLearn;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.alibaba.dubbo.rpc.RpcContext;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
