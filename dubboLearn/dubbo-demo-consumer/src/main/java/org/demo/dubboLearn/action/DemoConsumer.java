package org.demo.dubboLearn.action;

import com.alibaba.dubbo.config.annotation.Reference;
import org.demo.dubboLearn.DemoService;
import org.springframework.stereotype.Component;

@Component("demoConsumer")
public class DemoConsumer {
    @Reference
    private DemoService demoService;

    public String doSayHello(String name){
        return demoService.sayHello(name);
    }
}
